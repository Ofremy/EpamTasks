package com.epam.lab1.Controller;

import com.epam.lab1.Model.BookCreator;
import com.epam.lab1.Service.Generator;
import com.epam.lab1.Service.ObjectIO;
import com.epam.lab1.View.ConsoleViewer;
import org.apache.log4j.Logger;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import static com.epam.lab1.Service.Generator.*;

/**
 * Created by Orest
 * 10.11.2017
 * Java Version 1.8.
 */
public class Controll {
    private ConsoleViewer consoleViewer;
    private BookCreator repository = BookCreator.INSTANCE;
    private static final Logger logger = Logger.getLogger(Controll.class);

    public Controll(ConsoleViewer consoleViewer) {
        this.consoleViewer = consoleViewer;
    }


    public void go() throws IOException{
        do {
            logger.debug("start program");
            if (repository.getBookList().size() == 0) {
                consoleViewer.showRequestToAddNewBook();
                consoleViewer.showExitKey();
                parseInputData(getInputNumber());
            } else {
                consoleViewer.showRequestToAddNewBook();
                consoleViewer.showTasks();
                consoleViewer.showExitKey();
                try {
                    this.parseInputData(getInputNumber());
                } catch (IOException e) {
                    logger.error(e);
                    consoleViewer.showException(e);
                }
            }
        } while (true);
    }

    private int getInputNumber() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    private void parseInputData(int number) {
        if (repository.getBookList().size() == 0) {
            switch (number) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    logger.info("10 books create");
                    Generator.generateBooksArray(repository,10);
                    break;
                default:
                    consoleViewer.showError();
            }
        } else {
            switch (number) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    logger.info("10 books create");
                    Generator.generateBooksArray(repository,10);
                    break;
                case 2:
                    consoleViewer.printBooks(Generator
                            .getBooksByAuthor(repository.getBookList(), AUTHORS_ARRAY[(int) (Math.random() * AUTHORS_ARRAY.length)]));
                    break;
                case 3:
                    consoleViewer.printBooks(Generator
                            .getBooksByPublishingHouse(repository.getBookList(), PUBLISHING_HOUSE_ARRAY[(int) (Math.random() * PUBLISHING_HOUSE_ARRAY.length)]));
                    break;
                case 4:
                    consoleViewer.printBooks(Generator
                            .getOlderBooks(repository.getBookList(), YEARS_ARRAY[(int) (Math.random() * YEARS_ARRAY.length)]));
                    break;
                case 5:
                    Generator.sortBooksByPublishingHouse(repository.getBookList());
                    consoleViewer.printBooks(repository.getBookList());
                    break;
                case 6:
                    consoleViewer.printBooks(repository.getBookList());
                    break;
                case 7:
                    ObjectIO.saveObj(repository.getBookList(),"D:/1.txt");
                    break;
                case 8:
                    repository.addAll((List)ObjectIO.readObj("D:/1.txt"));
                    break;
                default:
                    consoleViewer.showMessage("Not Illegal number");
                    break;
            }
        }
    }
}
