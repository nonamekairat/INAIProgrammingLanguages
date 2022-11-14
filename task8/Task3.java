package com.java.se.ProgrammingLanguage.task8;

import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        String[] names = {"Kisalaiy","Kot","Snejka",
                "Kotintropl","Jirnyash","Kisa",
                "Kotyan","Kawainyash","Snejok","Jir"};
        HashMap<String, Cat> hashMap = new HashMap<>();
        for (String name: names) {
            Cat cat = new Cat(name,"white",3);
            hashMap.put(cat.getName(),cat);
        }
        hashMap.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
