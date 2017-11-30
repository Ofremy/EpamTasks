package com.epam.project1.service.myexception;


import com.epam.project1.service.ResourceManager;

import static com.epam.project1.view.Constants.WrongInput.WRONG_NUMBER_INPUT;

/**
 * Created by Orest
 * 24.11.2017
 * Java Version 1.8.
 */
public class WrongNumberInputException extends Exception{
    @Override
    public String getMessage() {
        return ResourceManager.INSTANCE.getString(WRONG_NUMBER_INPUT);
    }
}
