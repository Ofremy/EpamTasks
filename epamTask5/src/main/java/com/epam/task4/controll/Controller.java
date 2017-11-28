package com.epam.task4.controll;

import com.epam.task4.model.EMagazine;
import com.epam.task4.service.RecordCreator;
import com.epam.task4.service.ConsoleInput;
import com.epam.task4.service.LocaleManager;
import com.epam.task4.service.ResourceManager;
import com.epam.task4.view.ConsoleView;

import static com.epam.task4.view.Constants.LOCALE;

/**
 * Created by Orest
 * 24.11.2017
 * Java Version 1.8.
 */
public class Controller {
    private ConsoleView consoleView;
    private ConsoleInput consoleInput;
    private ResourceManager resourceManager = ResourceManager.INSTANCE;

    public Controller(ConsoleView consoleView, ConsoleInput consoleInput) {
        this.consoleView = consoleView;
        this.consoleInput = consoleInput;
    }

    public void go() {
        while (true) {
            consoleView.showMenu(resourceManager);
            switch (consoleInput.getNumberCase(consoleView)) {
                case ControllerConstants.SHOW_MAGAZINE_RECORDS:
                    consoleView.printAllRecords(EMagazine.INSTANCE.getArrayList());
                    break;
                case ControllerConstants.ADD_TO_MAGAZINE:
                    RecordCreator.INSTANCE.createRecord(consoleView, consoleInput);
                    break;
                case ControllerConstants.CHANGE_LOCALE:
                    consoleView.printMessage(resourceManager.getString(LOCALE));
                    resourceManager.changeResource(LocaleManager.INSTANCE.setLocale(consoleView, consoleInput));
                    break;
                case ControllerConstants.EXIT:
                    System.exit(0);
                    break;
            }
        }
    }

}
