package com.epam.lab1.Controller;

import com.epam.lab1.Model.Book;

import java.util.Arrays;

/**
 * Created by Orest
 * 09.11.2017
 * Java Version 1.8}.
 */
public class BookAnalyzer {
    static Book[] getBooksByAuthor(Book[] books, String author) {
        if (books == null) return null;
        Book[] resultBook = new Book[books.length];
        int count = 0;
        for (int i = 0; i < Book.countOfBooks; i++) {
            if (books[i].getAuthor().equals(author)) {
                resultBook[count++] = books[i];
            }
        }
        if (count == 0) return null;
        return Arrays.copyOf(resultBook, count);
    }

    static Book[] getBooksByPublishingHouse(Book[] books, String publishingHouse) {
        if (books == null) return null;
        Book[] resultBook = new Book[books.length];
        int count = 0;
        for (int i = 0; i < Book.countOfBooks; i++) {
            if (books[i].getPublishingHouse().equals(publishingHouse)) {
                resultBook[count++] = books[i];
            }
        }
        if (count == 0) return null;
        return Arrays.copyOf(resultBook, count);
    }

    static Book[] getOlderBooks(Book[] books, double year) {
        if (books == null) return null;
        Book[] resultBook = new Book[books.length];
        int count = 0;
        for (int i = 0; i < Book.countOfBooks; i++) {
            if (books[i].getYear() > year) {
                resultBook[count++] = books[i];
            }
        }
        if (count == 0) return null;
        return Arrays.copyOf(resultBook, count);
    }

    static void sortBooksByPublishingHouse(Book[] books) {
        Arrays.sort(books,new BookPublishingHouseComparator());

    }
}
