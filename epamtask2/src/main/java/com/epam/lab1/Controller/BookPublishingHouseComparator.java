package com.epam.lab1.Controller;

import com.epam.lab1.Model.Book;

import java.util.Comparator;

/**
 * Created by Orest
 * 09.11.2017
 * Java Version 1.8}.
 */
public class BookPublishingHouseComparator implements Comparator<Book> {
    public int compare(Book o, Book t1) {
            return o.getPublishingHouse().compareToIgnoreCase(t1.getPublishingHouse());
    }
}
