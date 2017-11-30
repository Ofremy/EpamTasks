package com.epam.project1.controller;

interface ControllerConstants {
    interface MainMenu {
        int SHOW_BUCKET_CONFECTIONERY = 1;
        int ADD_CONFECTIONERY_TO_BUCKET = 2;
        int SHOW_BUCKET_WEIGHT = 3;
        int SORT = 4;
        int FIND_CONFECTIONERY = 5;
        int CHANGE_LOCALE = 6;
        int EXIT = 0;
    }

    interface Confectionery {
        int ADD_CARAMEL = 1;
        int ADD_CHOCOLATE = 2;
        int ADD_COOKIES = 3;
        int ADD_SWEETS = 4;
        int BACK = 0;
    }

    interface Sort {
        int SORT_BY_WEIGHT = 1;
        int SORT_BY_SHUGARMG = 2;
        int SORT_BY_FAT = 3;
        int SORT_BY_PROTEIN = 4;
        int SORT_BY_CARBOHYDRATES = 5;
        int BACK = 0;
    }
}
