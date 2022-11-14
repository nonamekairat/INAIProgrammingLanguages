package com.java.se.ProgrammingLanguage.task9;

import java.util.Arrays;
import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        int[] ints = hashToMass(integers);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] hashToMass(HashSet<Integer> hashSet){
        int[] ints = new int[hashSet.size()];
        int i = 0;
        for (Integer in:hashSet) {
            ints[i] = in;
            i++;
        }
        return ints;
    }
}
