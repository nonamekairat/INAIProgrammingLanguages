package com.java.se.ProgrammingLanguage.task14;

public class MyQueue<T> {
    private T n;
    boolean valueSet = false;

    public synchronized T get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Пoлyчeнo: " + n);
        valueSet = false;
        notify();
        return n;
    }

    public synchronized void put(T n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet = true;
        this.n = n;
        System.out.println("Oтпpaвлeнo: " + n);
        notify();
    }
}
