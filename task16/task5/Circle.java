package com.java.se.ProgrammingLanguage.task16.task5;

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("draw Circle");
    }
}
