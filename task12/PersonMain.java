package com.java.se.ProgrammingLanguage.task12;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Simon",19,11000));
        persons.add(new Person("Mike",14,5000));
        persons.add(new Person("John",22,12000));
        persons.add(new Person("Li",17,17000));
        persons.add(new Person("Sam",32,32000));
        System.out.println("summary of salary of persons - " + sumSalary(persons));
        System.out.println("summary of age of persons - " + sumAge(persons));
        System.out.println("average salary persons - " + averageSalary(persons));
        System.out.println("average age of persons - " + averageAge(persons));
    }

    public static double sumSalary(List<Person> persons){
        return persons.stream().map(Person::getSalary).mapToDouble(Double::doubleValue).sum();
    }
    public static int sumAge(List<Person> persons){
        return persons.stream().map(Person::getAge).mapToInt(Integer::intValue).sum();
    }
    public static double averageSalary(List<Person> persons){
        return persons.stream().map(Person::getSalary).mapToDouble(Double::doubleValue).average().orElse(0);
    }
    public static double averageAge(List<Person> persons){
        return persons.stream().map(Person::getAge).mapToDouble(Integer::doubleValue).average().orElse(0);
    }




}
