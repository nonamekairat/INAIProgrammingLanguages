package com.java.se.ProgrammingLanguage.task16.task3;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
