package com.epam.lab1.Controller;

import com.epam.lab1.Model.Book;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Orest
 * 09.11.2017
 * Java Version 1.8}.
 */
public class Generator {
    public final static String[] NAMES_ARRAY = {"Harry Potter", "Oliver Twist", "Little Dorrit", "Phantom of the opera", "Indian Tales",
            "The Jungle Book", "The Years Between", "Traffics and Discoveries", "Martin Eden", "Whirligigs", "World"}; //10
    public final static String[] AUTHORS_ARRAY = {"Agatha Christie", "Lewis Carroll", "Theodore Dreiser", "Anne Bronte", "Anton Chekhov",
            "Arthur Conan Doyle", "Charles Dickens", "Daniel Defoe"};//8
    public final static String[] PUBLISHING_HOUSE_ARRAY = {"Ukraine", "United Kingdom", "Germany", "Poland", "France", "Italy", "Spain", "USA",
            "Norway"};//9
    public final static int[] YEARS_ARRAY = {1995, 1845, 1525, 1636, 1953, 1536, 1683, 963, 1784};//9
    public final static int[] NUMBERS_OF_PAGES_ARRAY = {254, 644, 515, 143, 942, 535, 1021, 545, 842}; //9
    public final static double[] PRICE_ARRAY = {256.5, 156.478, 414.68, 432.21345, 349.3, 252, 874, 451.9, 742}; //9


    public static Book[] generateBooksArray(int size) {
        Book[] books = new Book[size];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book(NAMES_ARRAY[(int) (Math.random() * NAMES_ARRAY.length)],
                    AUTHORS_ARRAY[(int) (Math.random() * AUTHORS_ARRAY.length)],
                    PUBLISHING_HOUSE_ARRAY[(int) (Math.random() * PUBLISHING_HOUSE_ARRAY.length)],
                    YEARS_ARRAY[(int) (Math.random() * YEARS_ARRAY.length)],
                    NUMBERS_OF_PAGES_ARRAY[(int) (Math.random() * NUMBERS_OF_PAGES_ARRAY.length)],
                    PRICE_ARRAY[(int) (Math.random() * PRICE_ARRAY.length)]);
        }
        return books;
    }
    public static Book[] getBooksByAuthor(Book[] books, String author) {
        if (books == null) return null;
        Book[] resultBook = new Book[books.length];
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author)) {
                resultBook[count++] = books[i];
            }
        }
        if (count == 0) return null;
        return Arrays.copyOf(resultBook, count);
    }

    public static Book[] getBooksByPublishingHouse(Book[] books, String publishingHouse) {
        if (books == null) return null;
        Book[] resultBook = new Book[books.length];
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublishingHouse().equals(publishingHouse)) {
                resultBook[count++] = books[i];
            }
        }
        if (count == 0) return null;
        return Arrays.copyOf(resultBook, count);
    }

    public static Book[] getOlderBooks(Book[] books, double year) {
        if (books == null) return null;
        Book[] resultBook = new Book[books.length];
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYear() > year) {
                resultBook[count++] = books[i];
            }
        }
        if (count == 0) return null;
        return Arrays.copyOf(resultBook, count);
    }

    public static void sortBooksByPublishingHouse(Book[] books) {
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book book, Book t1) {
                return book.getPublishingHouse().compareToIgnoreCase(t1.getPublishingHouse());
            }
        });

    }
}
