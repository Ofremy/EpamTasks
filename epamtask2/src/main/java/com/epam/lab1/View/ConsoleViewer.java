package com.epam.lab1.View;

import com.epam.lab1.Model.Book;

/**
 * Created by Orest
 * 09.11.2017
 * Java Version 1.8}.
 */
public class ConsoleViewer {
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void showException(Exception e) {
        System.out.println(e.getMessage());
    }

    public void showExitKey(){
        System.out.println("Что бы закончить работу с программой введите 0");
    }

    public void showRequestToAddNewBook() {
        System.out.println("Что бы добавить книги, введите 1");
    }

    public void showTasks() {
        System.out.println("Что бы получить список книг указанного автора введите 2");
        System.out.println("Что бы получить список книг, которые изданые указанным издательством введите 3");
        System.out.println("Что бы получить список книг, изданых позже указанного года введите 4");
        System.out.println("Что бы упорядочить книги по издательствам введите 5");
        System.out.println("");
    }

    public void printBooks(Book[] array) {
        if (array == null) {
            System.out.println("Книг не существует");
            return;
        }
        for (Book b : array) {
            System.out.println(b);
        }
        System.out.println("");
    }
}
