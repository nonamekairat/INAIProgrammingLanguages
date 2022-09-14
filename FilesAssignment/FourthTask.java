package com.java.se.ProgrammingLanguage.FilesAssignment;

import java.io.*;
import java.util.Collections;
import java.util.Scanner;

public class FourthTask {

    public static void main(String[] args) throws IOException {


        /**
        Создать программу, переписывающую в текстовый файл g содержимое файла f,
        исключая пустые строки, а остальные дополнить справа пробелами или
        ограничить до n символов
         */

        String path = "Files\\firstFile.txt";
        String pathTwo = "Files\\SecondFile.txt";

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ex(path,pathTwo,n);

    }
    private static void ex(String path,String pathTwo,int n) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(path));
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathTwo));

        while(reader.ready()){

            String line = reader.readLine();
            if(line.length() == 0) continue;
            else if(line.length() > n){
                line = line.substring(0,n);}
            else if(line.length() < n){
                line = line + String.join("", Collections.nCopies(n - line.length(), " "));
            }
            System.out.println(line);
            writer.write(line);
            writer.newLine();
        }

        writer.close();
        reader.close();

    }




}
