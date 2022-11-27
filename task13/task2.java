package com.java.se.ProgrammingLanguage.task13;

public class task2 {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();

        MyThreading myThreading = new MyThreading();
        MyThreading2 myThreading2 = new MyThreading2();
        printer.printing("Name","file21","file22","file23","file24","file25");
        myThreading.start();
        myThreading.join();
        myThreading2.start();

    }
}
