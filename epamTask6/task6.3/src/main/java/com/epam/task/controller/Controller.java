package com.epam.task.controller;

import com.epam.task.model.UnaryArithmeticOperation;
import com.epam.task.service.Reflections;
import com.epam.task.view.ConsoleView;

/**
 * Created by Orest
 * 03.12.2017
 * Java Version 1.8.
 */
public class Controller {
    private ConsoleView consoleView;
    private UnaryArithmeticOperation unaryArithmeticOperation;
    private String className = "com.epam.task.model.UnaryArithmeticOperation";

    public Controller() {
    }

    public Controller(ConsoleView consoleView, UnaryArithmeticOperation unaryArithmeticOperation) {

        this.consoleView = consoleView;
        this.unaryArithmeticOperation = unaryArithmeticOperation;
    }

    public void go() throws Exception {
        UnaryArithmeticOperation uao = (UnaryArithmeticOperation) Reflections.createObject(className);
        Reflections.fields(uao, consoleView);
        Reflections.methods(uao, consoleView);
    }
}
