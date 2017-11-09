package com.epam.lab1.Controller;

import com.epam.lab1.Model.Book;
import com.epam.lab1.View.ConsoleViewer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static com.epam.lab1.Model.BookData.*;

/**
 * Created by Orest
 * 09.11.2017
 * Java Version 1.8}.
 */
public class Generator {
    private Book[] book = new Book[10];

    public void go() {
        do {
            if (Book.countOfBooks < 1) {
                ConsoleViewer.showRequestToAddNewBook();
                ConsoleViewer.showExitKey();
                this.checkInputData();
                ConsoleViewer.printBooks(trimBookToSize());
            } else {
                ConsoleViewer.showRequestToAddNewBook();
                ConsoleViewer.showTasks();
                ConsoleViewer.showExitKey();
                this.checkInputData();
                ConsoleViewer.printBooks(trimBookToSize());
            }
        } while (true);
    }

    public void addBook() {
        this.ensureExplicitCapacity(Book.countOfBooks + 1);
        book[Book.countOfBooks] = new Book(NAMES_ARRAY[(int) (Math.random() * NAMES_ARRAY.length)],
                AUTHORS_ARRAY[(int) (Math.random() * AUTHORS_ARRAY.length)],
                PUBLISHING_HOUSE_ARRAY[(int) (Math.random() * PUBLISHING_HOUSE_ARRAY.length)],
                YEARS_ARRAY[(int) (Math.random() * YEARS_ARRAY.length)],
                NUMBERS_OF_PAGES_ARRAY[(int) (Math.random() * NUMBERS_OF_PAGES_ARRAY.length)],
                PRICE_ARRAY[(int) (Math.random() * PRICE_ARRAY.length)]);
    }



    private void checkInputData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int inputNumber = Integer.parseInt(reader.readLine());
            this.parseInputData(inputNumber);
        } catch (IOException | NumberFormatException e) {
            ConsoleViewer.showException(e);
        }

    }

    private void parseInputData(int number) {
        if (Book.countOfBooks < 1) {
            switch (number) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    this.addBook();
                    break;
                default:
                    ConsoleViewer.printMessage("Not Illegal Number");
            }
        } else {
            switch (number) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    this.addBook();
                    break;
                case 2:
                    ConsoleViewer.printBooks(BookAnalyzer
                            .getBooksByAuthor(this.trimBookToSize(), AUTHORS_ARRAY[(int) (Math.random() * AUTHORS_ARRAY.length)]));
                    break;
                case 3:
                    ConsoleViewer.printBooks(BookAnalyzer
                            .getBooksByPublishingHouse(this.trimBookToSize(), PUBLISHING_HOUSE_ARRAY[(int) (Math.random() * PUBLISHING_HOUSE_ARRAY.length)]));
                    break;
                case 4:
                    ConsoleViewer.printBooks(BookAnalyzer
                            .getOlderBooks(this.trimBookToSize(), YEARS_ARRAY[(int) (Math.random() * YEARS_ARRAY.length)]));
                    break;
                case 5:
                    BookAnalyzer.sortBooksByPublishingHouse(trimBookToSize());
                    ConsoleViewer.printBooks(this.book);
                    break;
                default:
                    ConsoleViewer.printMessage("Not Illegal number");
                    break;
            }
        }
    }

    public Book[] getBook() {
        return trimBookToSize();
    }

    public void setBook(Book[] book) {
        this.book = book;
        Book.countOfBooks = book.length;
    }

    private Book[] trimBookToSize() {
        int length = Book.countOfBooks;
        this.book = Arrays.copyOf(this.book, length);
        return this.book;
    }

    //   dynamic arrray realization

    private void grow(int size) {
        int length = this.book.length;
        int newCapacity = length + (length >> 1);
        if (newCapacity - size < 0) {
            newCapacity = size;
        }
        this.book = Arrays.copyOf(this.book, newCapacity);
    }

    private void ensureExplicitCapacity(int size) {
        if (size - this.book.length > 0) {
            this.grow(size);
        }
    }




}
