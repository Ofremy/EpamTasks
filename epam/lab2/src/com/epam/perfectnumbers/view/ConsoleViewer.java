package com.epam.perfectnumbers.view;

/**
 * Created by Orest on 06.11.2017.
 * Java version 1.8
 */
public class ConsoleViewer {
    public static void printMessage(int[] ints){
        if (ints == null) throw new IllegalArgumentException();
        for (int i : ints) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
