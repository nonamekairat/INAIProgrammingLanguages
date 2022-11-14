package com.java.se.ProgrammingLanguage.task10;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Task11 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5,"New York");
        treeMap.put(1,"Berlin");
        treeMap.put(2,"Cologne");
        treeMap.put(3,"Paris");
        treeMap.put(4,"Bishkek");
        System.out.println(treeMore(treeMap,2));
    }
    public static<T> Set<Integer> treeMore(TreeMap<Integer,T> treeMap, int less){

        return treeMap.keySet().stream().filter(e -> e > less).collect(Collectors.toCollection(TreeSet::new));
    }
}
