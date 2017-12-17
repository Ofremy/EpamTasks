package com.epam.project2.service;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Orest
 * 04.12.2017
 * Java Version 1.8.
 */
public class InputFileReader {
    private String fileName;

    public InputFileReader(String fileName) {
        this.fileName = fileName;
    }

    public String readFromFile() {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String s;
            while ((s = reader.readLine()) != null) {
                sb.append(s);
            }
            return sb.toString();
        } catch (IOException e) {
            return "";
        }

    }

}
