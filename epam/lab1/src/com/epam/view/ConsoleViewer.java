package com.epam.view;

/**
 * Created by Orest on 06.11.2017.
 * Java version 1.8
 */
public class ConsoleViewer {
    public static void printMessage(char[] chars){
        if (chars == null) throw new IllegalArgumentException();
        for (char c : chars) {
            System.out.print(c);
        }
        System.out.println("");
    }
}
