package com.epam.task4.view;

import com.epam.task4.model.Record;
import com.epam.task4.service.ResourceManager;
import static com.epam.task4.view.Constants.*;

import java.util.ArrayList;

/**
 * Created by Orest
 * 24.11.2017
 * Java Version 1.8.
 */
public class ConsoleView {
    public void printMessage(String message){
        System.out.println(message);
    }

    public void printAllRecords(ArrayList<Record> list){
        for (Record r : list) {
            System.out.println(r);
        }
        System.out.println();
    }

    public void showMenu(ResourceManager resourceManager){
        System.out.println(resourceManager.getString(SHOW_MAGAZINE_RECORDS));
        System.out.println(resourceManager.getString(ADD_TO_MAGAZINE));
        System.out.println(resourceManager.getString(CHANGE_LOCALE));
        System.out.println(resourceManager.getString(EXIT));
        System.out.println();
    }
}
