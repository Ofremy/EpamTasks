package com.epam.task4.service;

import com.epam.task4.service.myexception.WrongLocaleInputException;
import com.epam.task4.view.ConsoleView;

import java.util.Locale;

/**
 * Created by Orest
 * 27.11.2017
 * Java Version 1.8.
 */
public enum LocaleManager {
    INSTANCE;

    public Locale setLocale(ConsoleView consoleView, ConsoleInput consoleInput) {
        while (true) {
            try {
                String locale = consoleInput.getInputString();
                if (locale.equals("uk")) return new Locale("uk", "UA");
                else if (locale.equals("en")) return new Locale("en", "GB");
                else if (locale.equals("ru")) return Locale.getDefault();
                else throw new WrongLocaleInputException();
            } catch (WrongLocaleInputException e) {
                consoleView.printMessage(e.getMessage());
            }
        }
    }
}
