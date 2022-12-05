package com.java.se.ProgrammingLanguage.task14;

public class ForQueue {

    private String name;

    public ForQueue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ForQueue{" +
                "name='" + name + '\'' +
                '}';
    }
}
