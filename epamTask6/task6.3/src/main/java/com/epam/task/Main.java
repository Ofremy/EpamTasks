package com.epam.task;

import com.epam.task.controller.Controller;
import com.epam.task.model.UnaryArithmeticOperation;
import com.epam.task.view.ConsoleView;

/**
 * Created by Orest
 * 03.12.2017
 * Java Version 1.8.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ConsoleView consoleView = new ConsoleView();
        UnaryArithmeticOperation unaryArithmeticOperation = new UnaryArithmeticOperation();
        Controller controller = new Controller(consoleView,unaryArithmeticOperation);
        controller.go();
    }
}
