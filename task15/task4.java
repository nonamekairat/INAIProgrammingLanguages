package com.java.se.ProgrammingLanguage.task15;


import java.util.function.Consumer;

public class task4 {
    public static void main(String[] args) {
        Consumer<HeavyBox> weightGet = heavyBox -> System.out.println("Отгрузили ящик с весом " + heavyBox);
        Consumer<HeavyBox> weightSend = heavyBox -> System.out.println("Отправляем ящик с весом " + heavyBox);
        weightGet.andThen(weightSend).accept(new HeavyBox(100));
    }
}
