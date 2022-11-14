package com.java.se.ProgrammingLanguage.task8;

import java.util.HashSet;
import java.util.List;

public class Coll {
    public <T> List<T> setCollection(List<T> objects){
        HashSet<T> objectHashSet = new HashSet<>(objects);
        return objectHashSet.stream().toList();
    }
}
