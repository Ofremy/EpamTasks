package com.epam.matrix.analyzer;

/**
 * Created by Orest on 06.11.2017.
 * Java version 1.8
 */
public class Matrix {

    public static int[][] rotate(int[][] matrix) {
        if (matrix == null) throw new NullPointerException();
        int size = matrix.length;
        for (int i = 0; i < matrix.length / 2; i++)
        {
            for (int j = i; j < matrix[i].length - 1 - i; j++)
            {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][size - 1 - i];
                matrix[j][size - 1 - i] = matrix[size - 1 - i][size - 1 - j];
                matrix[size - 1 - i][size - 1 - j] = matrix[size - 1 - j][i];
                matrix[size - 1 - j][i] = tmp;
            }
        }
        return matrix;
    }

    public static int[][] getMatrixWithRandomElements(int size) {
        if (size < 0) throw new IllegalArgumentException();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 19 - 10);
            }
        }
        return matrix;
    }
}
