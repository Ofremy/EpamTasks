package com.epam.run;

import com.epam.view.ConsoleViewer;
import com.epam.controller.TransformNumber;

/**
 * Created by Orest on 06.11.2017.
 * Java version 1.8
 */
public class Runner {
    public static void main(String[] args) {
        ConsoleViewer.printMessage(TransformNumber.transformNumber(60,2));
        ConsoleViewer.printMessage(TransformNumber.transformNumber(3336,8));
        ConsoleViewer.printMessage(TransformNumber.transformNumber(32767,16));
        ConsoleViewer.printMessage(TransformNumber.transformNumber(4554,16));
        ConsoleViewer.printMessage(TransformNumber.transformNumber(6542,16));
    }
}
