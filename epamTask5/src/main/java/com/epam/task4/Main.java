package com.epam.task4;

import com.epam.task4.controll.Controller;
import com.epam.task4.service.ConsoleInput;
import com.epam.task4.view.ConsoleView;

/**
 * Created by Orest
 * 24.11.2017
 * Java Version 1.8.
 */
public class Main {
    public static void main(String[] args) {
        ConsoleView consoleView = new ConsoleView();
        ConsoleInput consoleInput = new ConsoleInput();
        Controller controller = new Controller(consoleView,consoleInput);
        controller.go();
    }
}
