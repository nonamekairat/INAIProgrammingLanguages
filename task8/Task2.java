package com.java.se.ProgrammingLanguage.task8;

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Арбуз","Ягода");
        hashMap.put("Банан","Трава");
        hashMap.put("Вишня","Ягода");
        hashMap.put("Груша","Фрукт");
        hashMap.put("Дыня","Овощ");
        hashMap.put("Ежевика","Куст");
        hashMap.put("Жень-шень","Корень");
        hashMap.put("Земляника","Ягода");
        hashMap.put("Ирис","Цветок");
        hashMap.put("Картофель","Клубень");
        hashMap.forEach((k,v) -> System.out.println(k + " - " + v));
    }
}
