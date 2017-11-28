package com.epam.task4.service;

import com.epam.task4.model.EMagazine;
import com.epam.task4.model.Record;
import com.epam.task4.view.ConsoleView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.epam.task4.view.Constants.*;

/**
 * Created by Orest
 * 27.11.2017
 * Java Version 1.8.
 */
public enum RecordCreator {
    INSTANCE;

    private ResourceManager resourceManager = ResourceManager.INSTANCE;

    public void createRecord(ConsoleView consoleView, ConsoleInput consoleInput) {
        String surName = getString(consoleView, consoleInput, ENTER_SURNAME, CHECK_ENTER_SURNAME);
        String firstName = getString(consoleView, consoleInput, ENTER_FIRSTNAME, CHECK_ENTER_FIRSTNAME);
        String address = getString(consoleView, consoleInput, ENTER_ADDRESS, CHECK_ENTER_ADDRESS);
        String phone = getString(consoleView, consoleInput, ENTER_PHONE, CHECK_ENTER_PHONE);

        EMagazine.INSTANCE.addRecord(new Record(surName, firstName, phone, address));
        consoleView.printMessage(resourceManager.getString(ADD_TO_BASE_COMPLETED));
    }


    private boolean check(String surname, String check) {
        Pattern p = Pattern.compile(check);
        Matcher m = p.matcher(surname);
        return m.find();
    }

    private String getString(ConsoleView consoleView, ConsoleInput consoleInput, String field, String checkField) {
        String result;
        while (true) {
            consoleView.printMessage(resourceManager.getString(field) + " "
                    + resourceManager.getString(IN_FORMAT) + " " + resourceManager.getString(checkField));
            result = consoleInput.getInputString();
            if (check(result, resourceManager.getString(checkField))) {
                break;
            }
            consoleView.printMessage(resourceManager.getString(WRONG_STRING_INPUT));
        }
        return result;
    }

}
