package com.epam.project2.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Orest
 * 04.12.2017
 * Java Version 1.8.
 */
public class Word {
    private List<Symbol> word = new ArrayList<>();

    public Word() {
    }

    public void addSymbol(Symbol symbol) {
        word.add(symbol);
    }

    @Override
    public String toString() {
        String result = "";
        for (Symbol s : word) {
            result += s.toString();
        }
        return result;

    }
}