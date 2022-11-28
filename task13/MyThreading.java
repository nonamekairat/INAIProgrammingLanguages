package com.java.se.ProgrammingLanguage.task13;

public class MyThreading extends Thread{
    public Printer printer;

    @Override
    public void run() {
        printer = new Printer();
        printer.printing("Thread1","file");
    }
}
