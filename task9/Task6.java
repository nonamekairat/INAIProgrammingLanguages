package com.java.se.ProgrammingLanguage.task9;

import java.util.HashSet;

public class Task6 {
    public static void main(String[] args) {
        HashSet<Integer> integers1 = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            integers1.add(i);
        }
        HashSet<Integer> integers2 = new HashSet<>();
        for (int i = 0; i < 15; i++) {
            integers2.add(i);
        }
        integers2.retainAll(integers1);
        System.out.println(integers2);
        System.out.println(integers1);
    }
}
