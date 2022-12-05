package com.java.se.ProgrammingLanguage.task14;

public class task3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("a");

        ThreadString threadString = new ThreadString(stringBuilder);
        ThreadString threadString1 = new ThreadString(stringBuilder);
        ThreadString threadString2 = new ThreadString(stringBuilder);
        threadString.start();
        threadString1.start();
        threadString2.start();
    }
}
