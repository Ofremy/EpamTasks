package com.epam.task4.service.myexception;

import com.epam.task4.service.ResourceManager;
import static com.epam.task4.view.Constants.*;
/**
 * Created by Orest
 * 27.11.2017
 * Java Version 1.8.
 */
public class WrongLocaleInputException extends Exception {
    @Override
    public String getMessage() {
        return ResourceManager.INSTANCE.getString(WRONG_LOCALE_INPUT);
    }
}
