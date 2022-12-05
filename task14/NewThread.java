package com.java.se.ProgrammingLanguage.task14;

public class NewThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("S");
        }
    }
}
