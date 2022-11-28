package com.java.se.ProgrammingLanguage.task13;

import java.util.Arrays;

public class Printer {


    public void printing(String name, String files){
//        String[] f = (String[]) Arrays.stream(files).toArray();
        System.out.println("Name - " + name);
        for (int i = 0; i < 50; i++) {
            System.out.println(name + " " + files + i);
        }
    }
}
