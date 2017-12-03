package com.epam.lab1.Service;

import com.epam.lab1.Controller.Constants;
import com.epam.lab1.Model.Book;
import com.epam.lab1.Model.BookCreator;

import java.util.*;

/**
 * Created by Orest
 * 09.11.2017
 * Java Version 1.8}.
 */
public class Generator implements Constants {
    public static List<Book> generateBooksArray(BookCreator books,int size) {
        for (int i = 0; i < size; i++) {
            books.add(new Book(NAMES_ARRAY[(int) (Math.random() * NAMES_ARRAY.length)],
                    AUTHORS_ARRAY[(int) (Math.random() * AUTHORS_ARRAY.length)],
                    PUBLISHING_HOUSE_ARRAY[(int) (Math.random() * PUBLISHING_HOUSE_ARRAY.length)],
                    YEARS_ARRAY[(int) (Math.random() * YEARS_ARRAY.length)],
                    NUMBERS_OF_PAGES_ARRAY[(int) (Math.random() * NUMBERS_OF_PAGES_ARRAY.length)],
                    PRICE_ARRAY[(int) (Math.random() * PRICE_ARRAY.length)]));
        }
        return books.getBookList();
    }


    public static List<Book> getBooksByAuthor(List<Book> bookList, String author) {
        if (bookList == null) return null;
        List<Book> resultList = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthor().equals(author)) {
                resultList.add(bookList.get(i));
            }
        }
        if (resultList.size() == 0) return null;
        return resultList;
    }

    public static List<Book> getBooksByPublishingHouse(List<Book> bookList, String publishingHouse) {

        if (bookList == null) return null;
        List<Book> resultList = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getPublishingHouse().equals(publishingHouse)) {
                resultList.add(bookList.get(i));
            }
        }
        if (resultList.size() == 0) return null;
        return resultList;
    }

    public static List<Book> getOlderBooks(List<Book> bookList, double year) {

        if (bookList == null) return null;
        List<Book> resultList = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getYear() == year) {
                resultList.add(bookList.get(i));
            }
        }
        if (resultList.size() == 0) return null;
        return resultList;
    }

    public static void sortBooksByPublishingHouse(List<Book> bookList) {
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book book, Book t1) {
                return book.getPublishingHouse().compareToIgnoreCase(t1.getPublishingHouse());
            }
        });

    }

}
