package com.epam.project1.service.confectioneryfactory;

import com.epam.project1.service.ResourceManager;

import static com.epam.project1.view.Constants.WrongInput.WRONG_ENUM_INPUT;

/**
 * Created by Orest
 * 29.11.2017
 * Java Version 1.8.
 */
public class WrongEnumTypeException extends Exception {
    @Override
    public String getMessage() {
        return ResourceManager.INSTANCE.getString(WRONG_ENUM_INPUT);
    }
}
