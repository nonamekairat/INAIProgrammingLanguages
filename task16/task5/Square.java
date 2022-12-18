package com.java.se.ProgrammingLanguage.task16.task5;

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("draw Square");
    }
}
