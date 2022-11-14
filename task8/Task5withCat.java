package com.java.se.ProgrammingLanguage.task8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task5withCat {
    public static void main(String[] args) {
        Set<Cat> catSet = new HashSet<>();

        catSet.add(new Cat("Snejok","White",7));
        catSet.add(new Cat("Snejka","White",13));
        catSet.add(new Cat("Darky","Black",5));

        Iterator<Cat> itr = catSet.iterator();  // list is a Set<String>!
        while (itr.hasNext())
        {
            int s = itr.next().getAge();
            if (s <= 5) {
                itr.remove();
            }
        }
        catSet.forEach(s -> System.out.println(s));




    }
}
