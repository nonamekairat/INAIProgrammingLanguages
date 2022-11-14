package com.java.se.ProgrammingLanguage.task7.second;

import java.util.Arrays;

public class Math<T extends Number> {
    private T[] array;

    public Math(T[] array) {
        this.array = array;
    }
    public double sumNum(){
        double sum = 0;
        for(T v: array){
            sum+=v.doubleValue();
        }
//        for (int i = 0; i < array.length; i++) {
//            sum += Double.parseDouble(array[i].toString());
//        }
        return sum;
    }
}
