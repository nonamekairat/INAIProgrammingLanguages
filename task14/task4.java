package com.java.se.ProgrammingLanguage.task14;

public class task4 {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue();

        Consumer<String> consumer = new Consumer(myQueue);
        Producer<String> producer = new Producer(myQueue);

        Thread t1 = new Thread(consumer);
        Thread t2 = new Thread(producer);

        t1.start();
        t2.start();
    }
}
