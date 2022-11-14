package com.java.se.ProgrammingLanguage.task10;

import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task10 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5,"New York");
        treeMap.put(1,"Berlin");
        treeMap.put(2,"Cologne");
        treeMap.put(3,"Paris");
        treeMap.put(4,"Bishkek");

        NavigableSet<Integer> navigableSet = new TreeSet<>(treeMap.keySet());
        for (Integer in: navigableSet) {
            System.out.println(in);
        }
    }
}
