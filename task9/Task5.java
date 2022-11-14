package com.java.se.ProgrammingLanguage.task9;

import java.util.HashSet;
import java.util.Iterator;

public class Task5 {
    public static void main(String[] args) {
        HashSet<Integer> integers1 = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            integers1.add(i);
        }
        HashSet<Integer> integers2 = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            integers2.add(i);
        }
        System.out.println(compareHashSets(integers1,integers2));
    }

    public static boolean compareHashSets(HashSet<Integer> hashSet1,HashSet<Integer> hashSet2){
        if(hashSet2.size() != hashSet1.size()) return false;
        Iterator<Integer> itr1 = hashSet1.iterator();
        Iterator<Integer> itr2 = hashSet2.iterator();
        boolean res = true;
        while(itr1.hasNext() && itr2.hasNext()){
            if(!(itr1.next().equals(itr2.next()))){
                res = false;
            }
        }
        return res;
    }
}
