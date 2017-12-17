package com.epam.project2;

import com.epam.project2.controller.Controller;
import com.epam.project2.view.ConsoleView;

/**
 * Created by Orest
 * 04.12.2017
 * Java Version 1.8.
 */
public class Main {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        Controller controller = new Controller(view);
        controller.go();
    }
}
