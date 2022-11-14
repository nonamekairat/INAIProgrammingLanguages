package com.java.se.ProgrammingLanguage.task7.third;

public class Elements<T> {
    private T[] elements;

    public Elements(T[] elements) {
        this.elements = elements;
    }

    public void printElem(){
        for(T element:elements){
            System.out.println(element);
        }
    }
}
