package com.java.se.ProgrammingLanguage.task14;

public class Consumer<T> implements Runnable {
    private MyQueue<T> myQueue;

    public Consumer(MyQueue<T> myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            myQueue.get();
        }
    }
}
