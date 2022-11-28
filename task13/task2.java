package com.java.se.ProgrammingLanguage.task13;

public class task2 {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();

        MyThreading myThreading = new MyThreading();
        MyThreading2 myThreading2 = new MyThreading2();
        printer.printing("Name","printer file");
        myThreading.start();
        myThreading.join();
        myThreading2.start();

    }
}
