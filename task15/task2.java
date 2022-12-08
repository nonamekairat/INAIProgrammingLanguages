package com.java.se.ProgrammingLanguage.task15;

import java.util.Objects;
import java.util.function.Predicate;

public class task2 {

    public static void main(String[] args) {
        Predicate<String> isNull = Objects::isNull;
        Predicate<String> isEmpty = s -> !s.isEmpty();
        System.out.println(isNull.and(isEmpty).test("something"));
    }


}

