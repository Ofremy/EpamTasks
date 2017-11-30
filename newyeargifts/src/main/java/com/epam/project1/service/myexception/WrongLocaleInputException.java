package com.epam.project1.service.myexception;



import com.epam.project1.service.ResourceManager;

import static com.epam.project1.view.Constants.WrongInput.WRONG_LOCALE_INPUT;


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
