package com.epam.pyramid.run;

import com.epam.pyramid.Controller.NumbersPyramid;
import com.epam.pyramid.view.ConsoleViewer;

/**
 * Created by Orest on 06.11.2017.
 * Java version 1.8
 */
public class Runner {
    public static void main(String[] args) {
        ConsoleViewer.printMessage(NumbersPyramid.getPyramid(5));
    }
}
