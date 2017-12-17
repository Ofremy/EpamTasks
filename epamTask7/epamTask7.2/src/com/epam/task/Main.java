package com.epam.task;

/**
 * Created by Orest
 * 10.12.2017
 * Java Version 1.8.
 */
public class Main {
    public static void main(String[] args) {
        Translater translater = new Translater();
        translater.put("banana","банан");
        translater.put("hello","привет");
        translater.put("world","мир");
        System.out.println(translater.translate("Hello world! I like banana, apple, orange and sport."));
    }
}
