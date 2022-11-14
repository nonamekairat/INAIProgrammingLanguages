package com.java.se.ProgrammingLanguage.task10;

import java.util.TreeMap;

public class Task9 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5,"New York");
        treeMap.put(1,"Berlin");
        treeMap.put(2,"Cologne");
        treeMap.put(3,"Paris");
        treeMap.put(4,"Bishkek");

        System.out.println(treeMap.firstKey() + "-" +treeMap.get(treeMap.firstKey()));
        System.out.println(treeMap.lastKey() + "-" +treeMap.get(treeMap.lastKey()));
    }
}
