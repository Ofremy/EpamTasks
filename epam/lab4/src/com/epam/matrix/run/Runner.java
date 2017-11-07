package com.epam.matrix.run;

import com.epam.matrix.analyzer.Matrix;
import com.epam.matrix.view.ConsoleWriter;

/**
 * Created by Богдан on 06.11.2017.
 * Java version 1.8
 */
public class Runner {
    public static void main(String[] args) {
        int[][] matrix = Matrix.getMatrixWithRandomElements(5);
        ConsoleWriter.printMessage(matrix);
        ConsoleWriter.printMessage(Matrix.rotate(matrix));

    }
}
