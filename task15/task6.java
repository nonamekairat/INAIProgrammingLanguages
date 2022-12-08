package com.java.se.ProgrammingLanguage.task15;

import java.util.function.Supplier;

public class task6 {
    public static void main(String[] args) {
        Supplier<Integer> random = () -> 1 + (int)(Math.random() * 10);
        System.out.println(random.get());
    }
}
