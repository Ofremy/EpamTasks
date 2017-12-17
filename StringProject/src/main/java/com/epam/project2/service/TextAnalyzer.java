package com.epam.project2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Orest
 * 04.12.2017
 * Java Version 1.8.
 */
public abstract class TextAnalyzer {
    public static String replaceSpaces(String text) {
        return text.replaceAll("[ \t]+", " ");
    }

    public static List<String> getSentencesList(String text) {
        String needToFind = "[^.!?]+[.!?] *";
        Pattern p = Pattern.compile(needToFind);
        Matcher m = p.matcher(text);
        List<String> list = new ArrayList<>();
        while (m.find()) {
            list.add(m.group());
        }
        return list;
    }

    public static String[] parseBySpaces(String text) {
        return text.split("[\\p{Space}]");
    }

    public static List<String> parseByWord(String text) {
        String[] split = text.split("\\p{P}?[ \\t\\n\\r-]");
        Pattern p = Pattern.compile("[a-zA-z]*");
        List<String> list = new ArrayList<>();
        for (String s : split) {
            String result = "";
            Matcher m = p.matcher(s);
            while (m.find()) {
                result += m.group();
            }
            list.add(result);
            if (list.contains("")) {
                list.remove("");
            }
        }
        return list;


    }

    public static char[] getEachSymbol(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

}
