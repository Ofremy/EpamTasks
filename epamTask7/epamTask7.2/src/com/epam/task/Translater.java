package com.epam.task;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Orest
 * 10.12.2017
 * Java Version 1.8.
 */
public class Translater {
    private Map<String,String> dictionary = new HashMap<>();

    public void put(String language1, String language2){
        dictionary.put(language1,language2);
    }

    {
        dictionary.put("i", "я");
        dictionary.put("like", "люблю");
        dictionary.put("apple", "яблоко");
        dictionary.put("orange", "апельсин");
        dictionary.put("and", "и");
        dictionary.put("sport", "спорт");
    }
    public Translater(){

    }

    public String translate(String sentence){
        for (Map.Entry<String,String> pair : dictionary.entrySet()) {
            if (sentence.contains(pair.getKey())){
                sentence = sentence.toLowerCase().replaceAll(pair.getKey(),pair.getValue());
            }
        }
        return sentence;
    }
}
