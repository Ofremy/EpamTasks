package com.epam.task4.model;

import java.util.ArrayList;

/**
 * Created by Orest
 * 24.11.2017
 * Java Version 1.8.
 */
public enum EMagazine {
    INSTANCE;

    private ArrayList<Record> recordList = new ArrayList<>();

    {
        recordList.add(new Record("Busel", "Orest", "+38038198493", "Ukraine,Kyiv,24"));
        recordList.add(new Record("Kozoriz", "Maks", "+88030197493", "Germany,Berli,48"));
        recordList.add(new Record("Kinash", "Aleeks", "+12038198493", "USA,Virginia,25"));
    }

    public ArrayList<Record> getArrayList() {
        return recordList;
    }

    public void addRecord(Record record) {
        recordList.add(record);
    }
}

