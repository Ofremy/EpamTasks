package com.epam.task4.service;

import com.epam.task4.service.myexception.WrongNumberInputException;
import com.epam.task4.view.ConsoleView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static com.epam.task4.view.Constants.LOCALE;

/**
 * Created by Orest
 * 24.11.2017
 * Java Version 1.8.
 */
public class ConsoleInput {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public String getInputString() {
        while (true) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public int getNumberCase(ConsoleView consoleView) {
        while (true) {
            try {
                int number = Integer.parseInt(reader.readLine());
                if (number >= 1 && number <= 4) {
                    return number;
                } else throw new WrongNumberInputException();
            } catch (IOException e) {
                consoleView.printMessage(Arrays.toString(e.getStackTrace()));
            } catch (WrongNumberInputException e) {
                consoleView.printMessage(e.getMessage());
            }
        }
    }
}
