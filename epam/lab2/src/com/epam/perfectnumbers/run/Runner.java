package com.epam.perfectnumbers.run;

import com.epam.perfectnumbers.controller.Finder;
import com.epam.perfectnumbers.view.ConsoleViewer;

/**
 * Created by Orest on 06.11.2017.
 * Java version 1.8
 */
public class Runner {
    public static void main(String[] args) {
        ConsoleViewer.printMessage(Finder.findPerfectNumbers(10000));
    }
}
