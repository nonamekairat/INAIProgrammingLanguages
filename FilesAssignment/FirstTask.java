package com.java.se.ProgrammingLanguage.FilesAssignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FirstTask {

    public static void main(String[] args) throws IOException {

        /**
        Cоздать типизированный файл записей со сведениями о телефонах абонентов;
        каждая запись имеет поля: фамилия абонента, год установки телефона, номер
        телефона. По заданной фамилии абонента выдать номера его телефонов.
        Определить количество установленных телефонов с N-го года
         */

        String path = "Files\\firstTask.txt";
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя для получения номеров на ваше имя:");
        String username = sc.nextLine();
        phoneNumbers(path,username);

        System.out.print("Введите год что бы получить количество установленных телефонов с этого года:");
        int year = sc.nextInt();
        phonesCount(path,year);


    }
    private static void phoneNumbers(String path,String surname) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(path));
        List<String> phoneNumbers = new ArrayList<>();
        while(reader.ready()){
            String[] token = reader.readLine().split(" ");
            if(surname.equals(token[0])){
                phoneNumbers.add(token[2]);
            }
        }
        System.out.print("Номера на ваше имя:");
        System.out.println(Arrays.toString(phoneNumbers.toArray()));
        reader.close();
    }
    private static void phonesCount(String path, int year) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(path));
        int counter = 0;
        while(reader.ready()){
            String[] token = reader.readLine().split(" ");
            if(Integer.parseInt(token[1]) >= year){
                counter++;
            }
        }
        System.out.print("количество установленных телефонов:");
        System.out.println(counter);
        reader.close();
    }





}
