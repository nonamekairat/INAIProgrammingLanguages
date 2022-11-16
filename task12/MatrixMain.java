package com.java.se.ProgrammingLanguage.task12;

import java.util.Arrays;

public class MatrixMain {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(new double[][] {{1,2},{3,4},{5,6},{7,8}});
        Matrix matrix2 = new Matrix(new double[][] {{1,2},{3,4},{5,6},{7,8}});

        matrix1.plusMatrix(matrix2);
        System.out.println(Arrays.deepToString(matrix1.getMatrix()));
        matrix1.multiplyMatrix(10);
        System.out.println(Arrays.deepToString(matrix1.getMatrix()));
        matrix1.printMatrix();
        matrix1.multiplyMatrix(matrix2);
        System.out.println(Arrays.deepToString(matrix1.getMatrix()));

    }



}
