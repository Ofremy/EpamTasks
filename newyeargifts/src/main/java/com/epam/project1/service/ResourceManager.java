package com.epam.project1.service;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Orest
 * 29.11.2017
 * Java Version 1.8.
 */
public enum  ResourceManager {
    INSTANCE;
    private ResourceBundle resourceBundle;
    private final String resourseName = "text";

    ResourceManager() {
        resourceBundle = ResourceBundle.getBundle(resourseName, Locale.getDefault());
    }

    public void changeResource(Locale locale) {
        resourceBundle = ResourceBundle.getBundle(resourseName, locale);
    }

    public String getString(String key) {
        return resourceBundle.getString(key);
    }
}
