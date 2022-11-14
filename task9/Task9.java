package com.java.se.ProgrammingLanguage.task9;

import java.util.HashSet;
import java.util.Set;

public class Task9 {
    public static void main(String[] args) {
        Set<Car> carSet = new HashSet<>();
        carSet.add(new Car("Honda","Model 1",2000));
        carSet.add(new Car("Toyota","Model 2",1999));
        carSet.add(new Car("Mercedes","Model 3",1998));
        carSet.add(new Car("BMW","Model 2",2010));
        carSet.add(new Car("Audi","Model 3",1988));
        for (Car car: carSet){
            System.out.println(car);
        }
    }
}
