package com.epam.pyramid.Controller;

/**
 * Created by Orest on 06.11.2017.
 * Java version 1.8
 */
public class NumbersPyramid {
    public static int[][] getPyramid(int number) {
        if (number > 9 || number < 1) throw new IllegalArgumentException();

        int[][] matrix = new int[number][(number - 1) * 2 + 1];
        for (int i = matrix.length - 1; i >= 0; i--) {

            //help to write copy of 1 part of array
            int reverseFlag = 0;

            matrix[i] = new int[(number - 1) * 2 + 1];
            for (int j = 0; j < matrix[i].length; j++) {
                if (j <= i) {
                    matrix[i][j] = j;
                } else if (j > i) {
                    reverseFlag += 2;
                    matrix[i][j] = matrix[i][j - reverseFlag];
                }
            }
            number--;
        }
        return matrix;
    }
}
