package com.java.se.ProgrammingLanguage.task9;

import java.util.Set;
import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>();
        Set<Integer> integersDescending = integers.descendingSet();
        for (int i = 0; i < 10; i++) {
            integers.add((int) (Math.random() * 100));
        }
        for (Integer in: integersDescending) {
            System.out.println(in);
        }
    }
}
