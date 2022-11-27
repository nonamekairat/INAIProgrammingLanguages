package com.java.se.ProgrammingLanguage.task13;

public class MyThreading2 extends Thread{

    public Printer printer;


    @Override
    public void run() {
        printer = new Printer();
        printer.printing("Name","file11","file12","file13","file14","file15");
    }

}
