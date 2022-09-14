package com.java.se.ProgrammingLanguage.FilesAssignment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SeventhTask {

    public static void main(String[] args) throws IOException {

        /**
        Получить файл g, состоящий из строк файла f, содержащих заданную строку S.
        Предусмотреть случай, когда строка размещается в двух строках файла «с
        переносом».
         **/

        String pathg = "Files\\g.txt";
        String pathf = "Files\\firstFile.txt";

        getFile(pathg,pathf,"Ipsum");

    }
    private static void getFile(String pathg,String pathf,String s) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(pathf));

        List<String> list = new ArrayList<>();
        String prev = "";
        while(reader.ready()){
            String line = reader.readLine();

            if(prev.equals("")){
                if(line.contains(s)){
                    list.add(line);
                }
            }else{
                if(line.contains(s)){
                    list.add(line);
                    prev = line;
                    continue;
                }
                if(prev.contains(s)){
                    if(line.contains(s)){
                        list.add(line);
                    }
                }else{
                    String doubleLine;
                    if (prev.endsWith("-")){
                        doubleLine = prev.substring(0,prev.length()-1) + "" + line;
                    }else{
                        doubleLine = prev + " " + line;
                    }

                    if(doubleLine.contains(s)){
                        list.add(prev);
                        list.add(line);
                    }


                }
            }
            prev = line;
        }
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(pathg));
        for (int i = 0; i < list.size(); i++) {
            writer.write(list.get(i));
            writer.newLine();
        }
        writer.close();
    }


}
