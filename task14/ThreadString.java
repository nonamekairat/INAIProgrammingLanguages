package com.java.se.ProgrammingLanguage.task14;

public class ThreadString extends Thread{
    private final StringBuilder stringBuilder;

    public ThreadString(StringBuilder sb) {
        this.stringBuilder = sb;
    }

    @Override
    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.println(stringBuilder + " " + i);
            }
            char ch = stringBuilder.charAt(0);
            stringBuilder.setCharAt(0, ++ch);
        }
    }
}
