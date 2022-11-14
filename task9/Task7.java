package com.java.se.ProgrammingLanguage.task9;

import java.util.TreeSet;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        TreeSet<Integer> integers1 = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            integers1.add(i);
        }
        TreeSet<Integer> lessSevenInteger = treeLess(integers1,7);
        for (Integer in: lessSevenInteger) {
            System.out.println(in);
        }
    }
    public static TreeSet<Integer> treeLess(TreeSet<Integer> treeSet,int less){
        return treeSet.stream().filter(e -> e < less).collect(Collectors.toCollection(TreeSet::new));
    }
}
