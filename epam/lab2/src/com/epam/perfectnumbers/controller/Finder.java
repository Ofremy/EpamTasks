package com.epam.perfectnumbers.controller;

/**
 * Created by Orest on 06.11.2017.
 * Java version 1.8
 */
public class Finder {
    public static int[] findPerfectNumbers(int number) {
        if (number < 0) throw new IllegalArgumentException();
        int maxSize = 10;
        int[] array = new int[maxSize];
        int max = number;
        int count = 0;
        int flag = 0;
        for (int j = 1; j <= max; j++) {
            number = j;
            for (int i = 1; i < number; i++) {
                if (number % i == 0)
                    flag += i;
            }
            if (flag == j) {
                array[count] = j;
                count++;
            }
            flag = 0;
        }
        int[]result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
}
