package com.epam.project1;

import com.epam.project1.controller.Controller;
import com.epam.project1.service.ConsoleInput;
import com.epam.project1.view.ConsoleView;

/**
 * Created by Orest
 * 29.11.2017
 * Java Version 1.8.
 */
public class Main {
    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        ConsoleView view = new ConsoleView();
        Controller controller = new Controller(view,input);
        controller.go();
    }
}
