package com.java.se.ProgrammingLanguage.task14;

public class Fork {
    private static int count = 0;
    private int id;
    private boolean isEating;

    public Fork() {
        id = ++count;
        isEating = false;
    }

    public synchronized void take() {
        if (isEating) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " схватил вилку " + id);
        isEating = true;
    }

    public synchronized void drop() {
        System.out.println(Thread.currentThread().getName() + " бросил вилку " + id);
        isEating = false;
        notify();
    }
}
