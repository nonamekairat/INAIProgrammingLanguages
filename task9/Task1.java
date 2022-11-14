package com.java.se.ProgrammingLanguage.task9;

import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            integers.add(i);
        }

        for(int i:integers){
            System.out.println(i);
        }
    }
}
