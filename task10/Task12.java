package com.java.se.ProgrammingLanguage.task10;

import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Task12 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5,"New York");
        treeMap.put(1,"Berlin");
        treeMap.put(2,"Cologne");
        treeMap.put(3,"Paris");
        treeMap.put(4,"Bishkek");
        System.out.println(getKeyBigger(5,treeMap));
    }
    public static <T> Integer getKeyBigger(int number, TreeMap<Integer, T> treeMap){
        try{
            return treeMap.keySet().stream().filter(e -> e > number).collect(Collectors.toCollection(TreeSet::new)).first();
        } catch (NoSuchElementException ex){
            return null;
        }
    }
}
