package com.epam.project1.service;

import com.epam.project1.service.myexception.WrongLocaleInputException;
import com.epam.project1.view.ConsoleView;

import java.util.Locale;

/**
 * Created by Orest
 * 27.11.2017
 * Java Version 1.8.
 */
public enum LocaleManager {
    INSTANCE;

    public Locale setLocale(ConsoleView consoleView, ConsoleInput consoleInput,
                            ResourceManager resourceManager,String message) {
        while (true) {
            try {
                String locale = consoleInput.getInputString(consoleView,resourceManager.getString(message));
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
