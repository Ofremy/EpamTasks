package com.epam.project1.view;

import com.epam.project1.model.Entity.AbstractConfectionery;
import com.epam.project1.service.ResourceManager;

import java.util.List;


/**
 * Created by Orest
 * 29.11.2017
 * Java Version 1.8.
 */
public class ConsoleView {
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printConfectioneries(List<AbstractConfectionery> list) {
        for (AbstractConfectionery r : list) {
            System.out.println(r);
        }
        System.out.println();
    }

    public void showMenu(ResourceManager resourceManager, String... strings) {
        for (String s : strings) {
            System.out.println(resourceManager.getString(s));
        }
        System.out.println();
    }

}
