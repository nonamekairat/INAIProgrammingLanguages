package com.java.se.ProgrammingLanguage.task7.third;

import com.java.se.ProgrammingLanguage.task8.Cat;

public class Main {
    public static void main(String[] args) {
        String[] arr1 = {"Cat", "Dog", "Mouse"};
        Integer[] arr2 = {1, 2, 3};

        // with Cat
        Cat[] arr3 = {new Cat("Snejok","White",3),
                new Cat("Snejka","White",2),
                new Cat("Darky","Black",1)};

        Elements<String> stringElements = new Elements<>(arr1);
        stringElements.printElem();
        Elements<Integer> integerElements = new Elements<>(arr2);
        integerElements.printElem();

        // with Cat
        Elements<Cat> catElements = new Elements<>(arr3);
        catElements.printElem();

    }
}
