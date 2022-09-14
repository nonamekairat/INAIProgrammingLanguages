package com.java.se.ProgrammingLanguage.FilesAssignment;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EighthTask {
    public static void main(String[] args) throws IOException {

        /**
        Получить файл g, в котором текст выровнен по правому краю путем
        равномерного добавления пробелов.
         */

        String path = "Files\\eighth.txt";
        right(path);
    }
    private static void right(String path) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(path));
        List<String> list = new ArrayList<>();
        int max = 0;
        while(reader.ready()){
            String line = reader.readLine();
            if(max < line.length()){
                max = line.length();
            }
            list.add(line);
        }
        reader.close();
        BufferedWriter writer =new BufferedWriter(new FileWriter(path));
        for (int i = 0; i < list.size(); i++) {
            String newLine = String.join("", Collections.nCopies(max - list.get(i).length(), " ")) + list.get(i);
            writer.write(newLine);
            writer.newLine();
        }
        writer.close();

    }
}
