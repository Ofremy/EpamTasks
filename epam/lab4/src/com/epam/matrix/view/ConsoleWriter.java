package com.epam.matrix.view;

/**
 * Created by Orest on 06.11.2017.
 * Java version 1.8
 */
public class ConsoleWriter {
    public static void printMessage(int[][] matrix){
        if (matrix == null) throw new IllegalArgumentException();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]+1 >=0) System.out.print(" " + (matrix[i][j]+1) + " ");
                else System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
