package com.epam.lab1.Controller;

import com.epam.lab1.Model.Book;
import com.epam.lab1.View.ConsoleViewer;
import static com.epam.lab1.Controller.Generator.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Orest
 * 10.11.2017
 * Java Version 1.8.
 */
public class Controll {
    private final static int BOOKS_COUNT = 15;
    private ConsoleViewer consoleViewer = new ConsoleViewer();
    private Book[] books;

    public void go() {
        do {
            if (books == null) {
                consoleViewer.showRequestToAddNewBook();
            } else {
                consoleViewer.showRequestToAddNewBook();
                consoleViewer.showTasks();
            }
            consoleViewer.showExitKey();
            this.checkInputData();
            consoleViewer.printBooks(books);
        } while (true);
    }

    private void checkInputData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int inputNumber = Integer.parseInt(reader.readLine());
            this.parseInputData(inputNumber);
        } catch (IOException | NumberFormatException e) {
            consoleViewer.showException(e);
        }

    }

    private void parseInputData(int number) {
        if (books == null) {
            switch (number) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    books = Generator.generateBooksArray(BOOKS_COUNT);
                    break;
                default:
                    consoleViewer.printMessage("Not Illegal Number");
            }
        } else {
            switch (number) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    books = Generator.generateBooksArray(BOOKS_COUNT);
                    break;
                case 2:
                    consoleViewer.printBooks(Generator
                            .getBooksByAuthor(books, AUTHORS_ARRAY[(int) (Math.random() * AUTHORS_ARRAY.length)]));
                    break;
                case 3:
                    consoleViewer.printBooks(Generator
                            .getBooksByPublishingHouse(books, PUBLISHING_HOUSE_ARRAY[(int) (Math.random() * PUBLISHING_HOUSE_ARRAY.length)]));
                    break;
                case 4:
                    consoleViewer.printBooks(Generator
                            .getOlderBooks(books, YEARS_ARRAY[(int) (Math.random() * YEARS_ARRAY.length)]));
                    break;
                case 5:
                    Generator.sortBooksByPublishingHouse(books);
                    consoleViewer.printBooks(books);
                    break;
                default:
                    consoleViewer.printMessage("Not Illegal number");
                    break;
            }
        }
    }
}
