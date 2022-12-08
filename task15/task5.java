package com.java.se.ProgrammingLanguage.task15;

import java.util.function.Function;

public class task5 {
    public static void main(String[] args) {
        Function<Double,String> something = i -> {
            String result = "Ноль";
            if(i > 0) result = "Положительное число";
            if(i < 0) result = "Отрицательное число";
            return result;
        };
        System.out.println(something.apply(5.7));
        System.out.println(something.apply(-5.7));
        System.out.println(something.apply(0.));
    }
}
