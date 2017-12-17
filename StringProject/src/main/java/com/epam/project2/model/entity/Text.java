package com.epam.project2.model.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Orest
 * 04.12.2017
 * Java Version 1.8.
 */
public final class Text {
    private Map<Sentence, Integer> map = new HashMap<>();

    public Text() {

    }

    public Map<Sentence, Integer> getMap() {
        return map;
    }

    public void put(Sentence sentence, Integer integer) {
        this.map.put(sentence, integer);
    }

    @Override
    public String toString() {
        String result = "";
        for (Sentence sentence : map.keySet()) {
            result += sentence;
        }
        return result;
    }
}
