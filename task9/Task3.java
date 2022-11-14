package com.java.se.ProgrammingLanguage.task9;

import java.util.HashSet;
import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {

        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            integers.add((int) (Math.random() * 100));
        }
        for (Integer in: integers) {
            System.out.println(in);
        }
        System.out.println("---------------");
        TreeSet<Integer> integers1 = hashToTree(integers);
        for (Integer in: integers1) {
            System.out.println(in);
        }

    }
    public static TreeSet<Integer> hashToTree(HashSet<Integer> hashSet){
        return new TreeSet<>(hashSet);
    }
}
