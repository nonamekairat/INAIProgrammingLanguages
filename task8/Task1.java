package com.java.se.ProgrammingLanguage.task8;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(4);
        Coll coll = new Coll();
        System.out.println(coll.setCollection(integers));
    }
}
