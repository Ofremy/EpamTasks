package com.epam.project2.model.entity;

/**
 * Created by Orest
 * 10.12.2017
 * Java Version 1.8.
 */
public final class Symbol {
    private final char symbol;

    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol + "";
    }

}
