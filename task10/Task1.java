package com.java.se.ProgrammingLanguage.task10;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Berlin");
        hashMap.put(2,"Cologne");
        hashMap.put(3,"Paris");
        hashMap.put(4,"Bishkek");
        hashMap.put(5,"New York");
        hashMap.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
