package com.java.se.ProgrammingLanguage.task15;

import java.util.function.Predicate;

public class task3 {
    public static void main(String[] args) {
        Predicate<String> startsWithJ = s -> s.startsWith("J");
        Predicate<String> startsWithN = s -> s.startsWith("N");
        Predicate<String> endsWithA = s -> s.endsWith("A");
        System.out.println(startsWithN.or(startsWithJ).and(endsWithA).test("JackA"));
        System.out.println(startsWithN.or(startsWithJ).and(endsWithA).test("NackA"));
        System.out.println(startsWithN.or(startsWithJ).and(endsWithA).test("KackA"));
    }
}
