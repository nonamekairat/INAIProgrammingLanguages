package com.java.se.ProgrammingLanguage.task9;

import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        TreeSet<Integer> integers1 = new TreeSet<>();

        for (int i = 1; i <= 11; i++) {
            integers1.add(i);
        }
        int eqIntegers1 = getIntEquals(11,integers1);
        System.out.println(eqIntegers1);
    }
    public static int getIntEquals(int number, TreeSet<Integer> treeSet){
        try{
            return treeSet.stream().filter(e -> e <= number).collect(Collectors.toCollection(TreeSet::new)).last();
        } catch (NoSuchElementException ex){
            return 0;
        }
    }
}
