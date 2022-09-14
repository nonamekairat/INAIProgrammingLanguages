package com.java.se.ProgrammingLanguage.FilesAssignment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FifthTask {

    public static void main(String[] args) throws Exception{

        /**
        В файле, содержащем фамилии студентов и их оценки, изменить на прописные
        буквы фамилии тех студентов, которые имеют средний балл за национальной
        шкалой более «4»
         */

        String path = "Files\\students.txt";

        change(path);

    }
    private static void change(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        List<String[]> list = new ArrayList<>();
        while(reader.ready()){
            String[] line = reader.readLine().split(" ");
            if(Integer.parseInt(line[1]) >= 4){
                line[0] = line[0].toUpperCase();
            }
            list.add(line);

        }
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        for (int i = 0; i < list.size(); i++) {
            writer.write(list.get(i)[0] + " " + list.get(i)[1]);
            writer.newLine();
        }
        writer.close();

    }

}
