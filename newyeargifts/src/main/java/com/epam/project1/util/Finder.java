package com.epam.project1.util;

import com.epam.project1.model.Entity.AbstractConfectionery;
import com.epam.project1.service.ConsoleInput;
import com.epam.project1.service.ResourceManager;
import com.epam.project1.view.ConsoleView;
import com.epam.project1.view.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Orest
 * 30.11.2017
 * Java Version 1.8.
 */
public class Finder {
    public static List<AbstractConfectionery> findConfectioneryInSugarRange(List<AbstractConfectionery> list,
                                                                            ConsoleView consoleView,
                                                                            ConsoleInput consoleInput,
                                                                            ResourceManager resourceManager) {

        double from = consoleInput.getDouble(consoleView, resourceManager.getString(Constants.ENTER_FROM));
        double to = consoleInput.getDouble(consoleView, resourceManager.getString(Constants.ENTER_TO));

        while (true) {
            if (from < to) {

                break;
            }
            consoleView.printMessage(resourceManager.getString(Constants.WrongInput.WRONG_NUMBER_INPUT));
            to = consoleInput.getDouble(consoleView, resourceManager.getString(Constants.ENTER_TO));
        }
        List<AbstractConfectionery> resultList = new ArrayList<AbstractConfectionery>();
        for (AbstractConfectionery obj : list) {
            if (obj.getShugarMg() >= from && obj.getShugarMg() <= to) {
                resultList.add(obj);
            }
        }
        if (resultList.size() == 0) {
            consoleView.printMessage(resourceManager.getString(Constants.NOT_SUCH_CONFECTIONERY_IN_RANGE));
        }
        return resultList;
    }

}
