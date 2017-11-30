package com.epam.project1.controller;

import com.epam.project1.model.BucketConfectioneryRepository;
import com.epam.project1.service.ConsoleInput;
import com.epam.project1.service.LocaleManager;
import com.epam.project1.service.ResourceManager;
import com.epam.project1.service.confectioneryfactory.ConfectioneryFactory;
import com.epam.project1.service.confectioneryfactory.ConfectioneryFactoryType;
import com.epam.project1.util.Finder;
import com.epam.project1.util.Sort;
import com.epam.project1.view.ConsoleView;
import com.epam.project1.view.Constants;

import static com.epam.project1.controller.ControllerConstants.MainMenu.*;
import static com.epam.project1.view.Constants.*;


/**
 * Created by Orest
 * 29.11.2017
 * Java Version 1.8.
 */
public class Controller {
    private ConsoleView consoleView;
    private ConsoleInput consoleInput;
    private ResourceManager resourceManager = ResourceManager.INSTANCE;
    private BucketConfectioneryRepository repository = BucketConfectioneryRepository.INSTANCE;

    public Controller(ConsoleView consoleView, ConsoleInput consoleInput) {
        this.consoleView = consoleView;
        this.consoleInput = consoleInput;
    }

    public void go() {
        int from = 0;
        int to = 6;
        while (true) {
            consoleView.showMenu(resourceManager,
                    Constants.ShowMenu.SHOW_BUCKET_CONFECTIONERY,
                    Constants.ShowMenu.ADD_CONFECTIOENERY_TO_BUCKET,
                    Constants.ShowMenu.SHOW_BUCKET_WEIGHT,
                    Constants.ShowMenu.SORT,
                    Constants.ShowMenu.FIND_CONFECTIONERY,
                    Constants.ShowMenu.CHANGE_LOCALE,
                    Constants.ShowMenu.EXIT);

            switch (consoleInput.getNumberCase(consoleView, from, to)) {

                case SHOW_BUCKET_CONFECTIONERY:
                    consoleView.printConfectioneries(repository.getBucketGift());
                    break;

                case ADD_CONFECTIONERY_TO_BUCKET:

                    addConfectioneryMenu();
                    break;

                case SHOW_BUCKET_WEIGHT:
                    consoleView.printMessage("Weight = " + repository.getBucketWeight());
                    break;

                case SORT:
                    sortByMenu();
                    break;

                case FIND_CONFECTIONERY:
                    consoleView.printConfectioneries(Finder.
                            findConfectioneryInSugarRange(
                                    repository.getBucketGift(),
                                    consoleView,consoleInput,resourceManager));
                    break;

                case CHANGE_LOCALE:
                    resourceManager.changeResource(LocaleManager.INSTANCE.setLocale(consoleView, consoleInput,
                            resourceManager,LOCALE));
                    break;

                case EXIT:
                    System.exit(0);
                    break;
            }
        }
    }

    private void sortByMenu() {
        int from = 0;
        int to = 5;
        label:
        while (true) {
            consoleView.showMenu(resourceManager,
                    Constants.ShowSorts.SORT_BY_WEIGHT,
                    Constants.ShowSorts.SORT_BY_SHUGARMG,
                    Constants.ShowSorts.SORT_BY_FAT,
                    Constants.ShowSorts.SORT_BY_PROTEIN,
                    Constants.ShowSorts.SORT_BY_CARBOHYDRATES,
                    Constants.BACK);
            switch (consoleInput.getNumberCase(consoleView, from, to)) {
                case ControllerConstants.Sort.SORT_BY_WEIGHT:
                    Sort.sortByWeight();
                    break;
                case ControllerConstants.Sort.SORT_BY_SHUGARMG:
                    Sort.sortByShugarmg();
                    break;
                case ControllerConstants.Sort.SORT_BY_FAT:
                    Sort.sortByFat();
                    break;
                case ControllerConstants.Sort.SORT_BY_CARBOHYDRATES:
                    Sort.sortByCarbohydrates();
                    break;
                case ControllerConstants.Sort.SORT_BY_PROTEIN:
                    Sort.sortByProtein();
                    break;
                case ControllerConstants.Sort.BACK:
                    break label;
            }
            consoleView.printMessage(resourceManager.getString(Constants.BUG_IS_SORTED));
        }

    }

    private void addConfectioneryMenu() {
        int from = 0;
        int to = 4;
        label:
        while (true) {
            consoleView.showMenu(resourceManager,
                    Constants.ShowConfectionery.ADD_CARAMEL,
                    Constants.ShowConfectionery.ADD_CHOCOLATE,
                    Constants.ShowConfectionery.ADD_COOKIES,
                    Constants.ShowConfectionery.ADD_SWEETS,
                    Constants.BACK);
            switch (consoleInput.getNumberCase(consoleView, from, to)) {
                case ControllerConstants.Confectionery.ADD_CARAMEL:
                    repository.addCondectionery(ConfectioneryFactory.
                            createConfectionery(ConfectioneryFactoryType.CARAMEL, consoleView,consoleInput));
                    break;
                case ControllerConstants.Confectionery.ADD_CHOCOLATE:
                    repository.addCondectionery(ConfectioneryFactory.
                            createConfectionery(ConfectioneryFactoryType.CHOCOLATE, consoleView,consoleInput));
                    break;
                case ControllerConstants.Confectionery.ADD_COOKIES:
                    repository.addCondectionery(ConfectioneryFactory.
                            createConfectionery(ConfectioneryFactoryType.COOKIES, consoleView,consoleInput));
                    break;
                case ControllerConstants.Confectionery.ADD_SWEETS:
                    repository.addCondectionery(ConfectioneryFactory.
                            createConfectionery(ConfectioneryFactoryType.SWEETS, consoleView,consoleInput));
                    break;
                case ControllerConstants.Confectionery.BACK:
                    break label;
            }
            consoleView.printMessage(resourceManager.getString(Constants.ADD_TO_BUCKET_COMPLETED));
        }
    }

}
