package com.java.se.ProgrammingLanguage.task15;

interface Printable{
    void print(String s);
}

public class task1 {

    public static void main(String[] args) {

        Printable printer = s->System.out.println(s);
        printer.print("Hello Java!");
    }
}