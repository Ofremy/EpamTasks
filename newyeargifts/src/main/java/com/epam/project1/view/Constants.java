package com.epam.project1.view;

/**
 * Created by Orest
 * 29.11.2017
 * Java Version 1.8.
 */
public interface Constants {
    String LOCALE = "locale";
    String IN_FORMAT = "in.format";
    String ADD_TO_BUCKET_COMPLETED = "add.to.bucket.completed";
    String BUG_IS_SORTED = "bug.is.sorted";
    String BACK = "0.back";
    String ENTER_FROM = "enter.from";
    String ENTER_TO = "enter.to";
    String NOT_SUCH_CONFECTIONERY_IN_RANGE = "not.such.confectionery.in.range";

    interface ShowMenu {
        String SHOW_BUCKET_CONFECTIONERY = "1.show.bucket.confectionery";
        String ADD_CONFECTIOENERY_TO_BUCKET = "2.add.confectionery.to.bucket";
        String SHOW_BUCKET_WEIGHT = "3.show.bucket.weight";
        String SORT = "4.sort";
        String FIND_CONFECTIONERY = "5.find.confectionery";
        String CHANGE_LOCALE = "6.change.locale";
        String EXIT = "0.exit";
    }

    interface ShowConfectionery {
        String ADD_CARAMEL = "1.add.caramel";
        String ADD_CHOCOLATE = "2.add.chocolate";
        String ADD_COOKIES = "3.add.cookies";
        String ADD_SWEETS = "4.add.sweets";
    }

    interface ShowSorts {
        String SORT_BY_WEIGHT = "1.sort.by.weight";
        String SORT_BY_SHUGARMG = "2.sort.by.shugarmg";
        String SORT_BY_FAT = "3.sort.by.fat";
        String SORT_BY_PROTEIN = "4.sort.by.protein";
        String SORT_BY_CARBOHYDRATES = "5.sort.by.carbohydrates";

    }

    interface WrongInput {
        String WRONG_ENUM_INPUT = "wrong.enum.input";
        String WRONG_STRING_INPUT = "wrong.string.input";
        String WRONG_NUMBER_INPUT = "wrong.number.input";
        String WRONG_LOCALE_INPUT = "wrong.locale.input";
    }

    interface FieldsInput {
        String ENTER_NAME = "enter.name";
        String ENTER_FAT = "enter.fat";
        String ENTER_CARBOHYDRATES = "enter.carbohydrates";
        String ENTER_PROTEIN = "enter.protein";
        String ENTER_WEIGHT = "enter.weight";
        String ENTER_SHUGARMG = "enter.shugarmg";
        String ENTER_CARAMELMG = "enter.caramelmg";
        String ENTER_CHOCOLATEMG = "enter.chocolatemg";
        String ENTER_COOKIES_FORM = "enter.cookies.form";
        String ENTER_SWEETS_COLOR = "enter.sweets.color";

    }

    interface CheckFieldsInput {
        String CHECK_ENTER_NAME = "check.enter.name";
        String CHECK_ENTER_COOKIES_FORM = "check.enter.cookies.form";
        String CHECK_ENTER_SWEETS_COLOR = "check.enter.sweets.color";
        /*String CHECK_ENTER_FAT = "check.enter.fat";
        String CHECK_ENTER_CARBOHYDRATES = "check.enter.carbohydrates";
        String CHECK_ENTER_PROTEIN = "check.enter.protein";
        String CHECK_ENTER_WEIGHT = "check.enter.weight";
        String CHECK_ENTER_SHUGARMG = "check.enter.shugarmg";
        String CHECK_ENTER_CARAMELMG = "check.enter.caramelmg";
        String CHECK_ENTER_CHOCOLATEMG = "check.enter.chocolatemg";*/
    }
}
