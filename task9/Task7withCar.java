package com.java.se.ProgrammingLanguage.task9;

import java.util.TreeSet;
import java.util.stream.Collectors;

public class Task7withCar {
    public static void main(String[] args) {
        TreeSet<Car> carTreeSet = new TreeSet<>();

        carTreeSet.add(new Car("Honda","Model 1",2000));
        carTreeSet.add(new Car("Toyota","Model 2",1999));
        carTreeSet.add(new Car("Mercedes","Model 3",1996));
        carTreeSet.add(new Car("BMW","Model 2",2010));
        carTreeSet.add(new Car("Audi","Model 3",1988));
        TreeSet<Car> eqIntegers1 = treeLess(carTreeSet,2000);
        eqIntegers1.forEach(System.out::println);
    }
    public static TreeSet<Car> treeLess(TreeSet<Car> treeSet,int less){
        return treeSet.stream().filter(e -> e.getYearRelease() < less).collect(Collectors.toCollection(TreeSet::new));
    }
}
