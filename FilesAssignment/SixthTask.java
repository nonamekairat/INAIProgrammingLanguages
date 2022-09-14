package com.java.se.ProgrammingLanguage.FilesAssignment;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SixthTask {

    public static void main(String[] args) throws IOException {
        /**
        Из текстового файла удалить все слова, содержащие от трех до пяти символов,
        но при этом из каждой строки должно быть удалено только четное количество
        таких слов
         **/

        String path = "Files\\students.txt";
        delete(path);

    }
    private static void delete(String path) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(path));
        List<String[]> list = new ArrayList<>();
        while(reader.ready()){
            String[] line = reader.readLine().split(" ");
            int counter = 0;
            String last = line[0];
            int lastIndex = 0;
            for (int i = 0; i < line.length; i++) {
                if(line[i].length() >= 3 && line[i].length() <= 5){
                    last = line[i];
                    lastIndex = i;
                    line[i] = "";
                    counter++;
                }
            }
            if (counter % 2 != 0){
                line[lastIndex] = last;
            }
            list.add(line);
        }
        reader.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        for (int l = 0; l < list.size(); l++) {

            String line = String.join(" ",list.get(l));
            writer.write(line);
            writer.newLine();

        }

        writer.close();

    }
}
