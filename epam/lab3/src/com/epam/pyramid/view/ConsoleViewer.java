package com.epam.pyramid.view;

/**
 * Created by Orest on 06.11.2017.
 * Java version 1.8
 */
public class ConsoleViewer {
    public static void printMessage(int[][] matrix){
        if (matrix == null) throw new IllegalArgumentException();
        for (int i = 0; i < matrix.length; i++) {
            // fill with space
            for (int k = 0; k < (matrix[matrix.length-1].length)/2 - i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + 1);
            }
            System.out.println();
        }
    }
}
