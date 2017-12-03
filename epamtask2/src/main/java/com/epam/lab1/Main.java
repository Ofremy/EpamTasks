package com.epam.lab1;

import com.epam.lab1.Controller.Controll;
import com.epam.lab1.Model.Book;
import com.epam.lab1.View.ConsoleViewer;

import java.io.IOException;

/**
 * Created by Orest
 * 09.11.2017
 * Java Version 1.8.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ConsoleViewer consoleViewer = new ConsoleViewer();
        Controll controll = new Controll(consoleViewer);
        controll.go();
    }
}
