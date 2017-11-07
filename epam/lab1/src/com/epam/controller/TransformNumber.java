package com.epam.controller;

/**
 * Created by Orest on 06.11.2017.
 * Java version 1.8
 */
public class TransformNumber {
    public static char[]transformNumber(int number,int index){
        if (index != 2 && index!=8 && index!=16 && number < 0) throw new IllegalArgumentException();
        return convert(number,index);

    }
    private static char[]convert(int number, int index){
        int count = 0;
        char[] chars = new char[number];
        while (number > 0){
            int remainder = number % index;
            if (index == 16 && remainder > 9) chars[count++] = (char) (remainder + '7');
            else chars[count++] = (char) (remainder + '0');
            number = number / index;
        }
        return reverseArray(new char[count],chars);
    }
    private static char[]reverseArray(char[] newArray ,char[] oldArray){
        for (int i = newArray.length - 1, j = 0; i >= 0; i--, j++) {
            newArray[j] = oldArray[i];
        }
        return newArray;
    }



}
