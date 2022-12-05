package com.java.se.ProgrammingLanguage.task14;

import java.util.Queue;

public class Producer<T> implements Runnable {
    private MyQueue<T> myQueue;

    public Producer(MyQueue<T> myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            myQueue.put((T) ("Something " + i));
        }
    }
}
