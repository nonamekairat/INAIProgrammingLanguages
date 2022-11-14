package com.java.se.ProgrammingLanguage.task8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        List<String> strings = Arrays.asList((
                "Лесопарк Линолеум Лобастый Лопотать " +
                        "Лупиться Ладиться Ласточка Леденеть" +
                        " Либретто Литейный Логовище Лохматый" +
                        " Льстивый Лакомить Лебезить Лежневка" +
                        " Лениться Лиловеть Литургия Ложчатый").split(" "));
        stringSet.addAll(strings);
        System.out.println(stringSet);

    }
}
