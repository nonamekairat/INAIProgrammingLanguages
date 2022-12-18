package com.java.se.ProgrammingLanguage.task16.task3;

public class SingleObject {

    private static final SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("show Message");
    }
}
