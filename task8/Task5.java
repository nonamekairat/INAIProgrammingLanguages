package com.java.se.ProgrammingLanguage.task8;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        while(integerSet.size() < 10){
            integerSet.add(getRandom());
        }

        // with remove
        Iterator<Integer> itr = integerSet.iterator();
        System.out.println(integerSet);

        while (itr.hasNext())
        {
            int s = itr.next();
            if (s > 10) {
                itr.remove();
            }
        }
        System.out.println(integerSet);

        Set<Integer> integerSet1 = new HashSet<>();
        while(integerSet1.size() < 10){
            integerSet1.add(getRandom());
        }

        // without .remove
        System.out.println(integerSet1);
        Set<Integer> newIntSet = moreThanTen(integerSet1);
        System.out.println(newIntSet);

    }

    public static int getRandom(){
        return (int) Math.round(Math.random() * 20);
    }
    public static Set<Integer> moreThanTen(Set<Integer> integerSet){
        List<Integer> integerList = new ArrayList<>(integerSet);
        Set<Integer> resInt = new HashSet<>();
        for(int i = 0; i < integerList.size(); i++) {
            if(integerList.get(i) > 10){
                resInt.add(integerList.get(i));
            }
        }
        return resInt;
    }
}
