package com.java.se.ProgrammingLanguage.task12;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Matrix {

    private int rows;
    private int columns;
    private double[][] matrix;

    public Matrix(double[][] matrix) {
        this.rows = matrix.length;
        this.columns = matrix[0].length;
        this.matrix = matrix;
    }

    public void plusMatrix(Matrix matrix1){
        matrix = IntStream.range(0, matrix1.getMatrix().length)
                .mapToObj(i -> IntStream.range(0,matrix[i].length)
                        .mapToDouble(j -> matrix1.getMatrix()[i][j] +matrix[i][j]).toArray())
                .toArray(double[][]::new);
    }
    public void multiplyMatrix(double n){
        matrix = Arrays.stream(matrix).map(doubles -> Arrays.stream(doubles).map(v -> v * n).toArray())
                .toArray(double[][]::new);
    }
    public void printMatrix(){
        Arrays.stream(matrix).forEach(arr -> Arrays.stream(arr).forEach(System.out::println));
    }
    public void multiplyMatrix(Matrix matrix1){
        matrix = IntStream.range(0, matrix1.getMatrix().length)
                .mapToObj(i -> IntStream.range(0,matrix[i].length)
                        .mapToDouble(j -> matrix1.getMatrix()[i][j] * matrix[i][j]).toArray())
                .toArray(double[][]::new);
    }


//    public double[] add(int[] arr1,int[] arr2){
//        return IntStream.range(0,arr1.length).mapToDouble(i -> arr1[i] + arr2[i]).toArray();
//    }




















    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }
}
