package com.epam.lab1.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Orest
 * 02.12.2017
 * Java Version 1.8.
 */
public enum  BookCreator {
    INSTANCE;

    private List<Book> bookList = new ArrayList<>();

    public List<Book> getBookList() {
        return bookList;
    }

    public void add(Book book) {
        bookList.add(book);
    }

    public void addAll(List<Book> bookList){
        this.bookList = bookList;
    }
}
