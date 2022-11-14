package com.java.se.ProgrammingLanguage.task10;

import com.java.se.ProgrammingLanguage.task9.Car;

import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Task12withCar {
    public static void main(String[] args) {
        TreeMap<Car,Integer> treeMap = new TreeMap<>();
        treeMap.put(new Car("Honda","Model 1",2000),5);
        treeMap.put(new Car("Toyota","Model 2",1999),1);
        treeMap.put(new Car("Mercedes","Model 3",1996),2);
        treeMap.put(new Car("BMW","Model 2",2010),3);
        treeMap.put(new Car("Audi","Model 3",1988),4);
        System.out.println(getAfterYear(1997,treeMap));
    }
    public static <T> Car getAfterYear(int year, TreeMap<Car, T> treeMap){
        try{
            return treeMap.keySet().stream().filter(e -> e.getYearRelease() > year).collect(Collectors.toCollection(TreeSet::new)).last();
        } catch (NoSuchElementException ex){
            return null;
        }
    }
}
