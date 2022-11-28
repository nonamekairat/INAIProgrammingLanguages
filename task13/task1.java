package com.java.se.ProgrammingLanguage.task13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class task1 {
    public static void main(String[] args) throws InterruptedException {

        task1Runnable something = new task1Runnable();
        Thread thread = new Thread(something);


        Thread thread1 = new Thread(() -> {

            HashMap<String, String> questions;
            questions = new HashMap<>();
            questions.put("1 + 1 = ?","2");
            questions.put("20 * 4 = ?","8");
            questions.put("22 - 17 = ?","5");
            questions.put("44 * 30 = ?","1320");
            questions.put("89 + 11 = ?","100");
            questions.put("66 - 55 = ?","11");
            questions.put("37 + 33 = ?","70");
            questions.put("69 + 33 = ?","102");
            questions.put("77 + 99 = ?","176");
            questions.put("22 / 7 = ?","3.14");

            for (String key: questions.keySet()) {
                System.out.println("Hello, " + key);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(questions.get(key));
            }
        });

        thread.start();
        thread1.start();
    }
}
