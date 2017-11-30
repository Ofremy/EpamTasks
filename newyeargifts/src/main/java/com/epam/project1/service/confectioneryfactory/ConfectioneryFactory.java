package com.epam.project1.service.confectioneryfactory;

import com.epam.project1.model.Entity.*;
import com.epam.project1.service.ConsoleInput;
import com.epam.project1.service.ResourceManager;
import com.epam.project1.view.ConsoleView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.epam.project1.view.Constants.CheckFieldsInput.*;
import static com.epam.project1.view.Constants.FieldsInput.*;
import static com.epam.project1.view.Constants.IN_FORMAT;
import static com.epam.project1.view.Constants.WrongInput.WRONG_NUMBER_INPUT;
import static com.epam.project1.view.Constants.WrongInput.WRONG_STRING_INPUT;


/**
 * Created by Orest
 * 29.11.2017
 * Java Version 1.8.
 */
public class ConfectioneryFactory {
    private static ResourceManager resourceManager = ResourceManager.INSTANCE;

    public static AbstractConfectionery createConfectionery(ConfectioneryFactoryType type, ConsoleView consoleView,
                                                            ConsoleInput consoleInput) {

        String name = getString(consoleView, consoleInput, ENTER_NAME, CHECK_ENTER_NAME);
        double fat = getDouble(consoleView, consoleInput, ENTER_FAT);
        double carb = getDouble(consoleView, consoleInput, ENTER_CARBOHYDRATES);
        double protein = getDouble(consoleView, consoleInput, ENTER_PROTEIN);
        double shugarmg = getDouble(consoleView, consoleInput, ENTER_SHUGARMG);
        double weight = getDouble(consoleView, consoleInput, ENTER_WEIGHT);

        while (true) {
            try {
                switch (type) {
                    case CARAMEL:
                        double caramelMg = getDouble(consoleView, consoleInput, ENTER_CARAMELMG);
                        return new Caramel(name, fat, carb, protein, weight, shugarmg, caramelMg);
                    case CHOCOLATE:
                        double chocolateMg = getDouble(consoleView, consoleInput, ENTER_CHOCOLATEMG);
                        return new Chocolate(name, fat, carb, protein, weight, shugarmg, chocolateMg);
                    case COOKIES:
                        String form = getString(consoleView, consoleInput, ENTER_COOKIES_FORM, CHECK_ENTER_COOKIES_FORM);
                        return new Cookies(name, fat, carb, protein, weight, shugarmg, Cookies.Form.valueOf(form.toUpperCase()));
                    case SWEETS:
                        String color = getString(consoleView, consoleInput, ENTER_SWEETS_COLOR, CHECK_ENTER_SWEETS_COLOR);
                        return new Sweets(name, fat, carb, protein, weight, shugarmg, Sweets.Color.valueOf(color.toUpperCase()));
                    default:
                        throw new WrongEnumTypeException();
                }
            } catch (WrongEnumTypeException e) {
                consoleView.printMessage(e.getMessage());
            }
        }

    }


    private static boolean check(String surname, String check) {
        Pattern p = Pattern.compile(check);
        Matcher m = p.matcher(surname);
        return m.find();
    }

    private static String getString(ConsoleView consoleView, ConsoleInput consoleInput,
                                    String field, String checkField) {
        String result;
        while (true) {
            result = consoleInput.getInputString(consoleView, resourceManager.getString(field) + " "
                    + resourceManager.getString(IN_FORMAT) + " " + resourceManager.getString(checkField));
            if (check(result, resourceManager.getString(checkField))) {
                break;
            }
            consoleView.printMessage(resourceManager.getString(WRONG_STRING_INPUT));
        }
        return result;
    }

    private static double getDouble(ConsoleView consoleView, ConsoleInput consoleInput, String field) {
        double result;
        while (true) {
            try {
                result = Double.parseDouble(consoleInput.getInputString(consoleView, resourceManager.getString(field)));
                break;
            } catch (NumberFormatException e) {
                consoleView.printMessage(resourceManager.getString(WRONG_NUMBER_INPUT));
            }

        }
        return result;
    }
}
