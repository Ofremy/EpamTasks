package com.epam.project2.model.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Orest
 * 04.12.2017
 * Java Version 1.8.
 */
public final class Sentence {
    private List<Word> elements = new ArrayList<>();

    public void addWord(Word word) {
        elements.add(word);
    }

    public Sentence() {
    }

    @Override
    public String toString() {
        String result = "";
        for (Word element : elements) {
            result+=element + " ";
        }
        return result+"\n";
    }
}
