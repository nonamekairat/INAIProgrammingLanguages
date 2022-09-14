package com.java.se.ProgrammingLanguage.FilesAssignment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ThirdTask {

    static int maxLength = 0;
    static int linesCount = 0;

    public static void main(String[] args) throws IOException {

        /**
        Имеется файл с текстом. Осуществить шифрование данного текста в новый файл
        путем записи текста в матрицу символов по строкам, а затем чтение символов из
        этой матрицы по столбцам. Осуществить расшифровку полученного текста.
         **/

        String path = "Files\\firstFile.txt";
        String pathTwo = "Files\\SecondFile.txt";

        //шифровка с одного файла в другой
        getText(path,pathTwo);

        //Дешифровка файла
        decryption(pathTwo);


    }

    private static void getText(String path,String pathTwo) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(path));
        List<char[]> list = new ArrayList<>();
        maxLength = 0;
        while(reader.ready()){
            char[] token = reader.readLine().toCharArray();
            if(token.length > maxLength){
                maxLength = token.length;
            }
            list.add(token);
        }
        reader.close();
        encrypt(pathTwo,list,maxLength);

    }
    private static int encrypt(String path, List<char[]> list, int maxLength) throws IOException{

        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        linesCount = 0;
        for (int i = 0; i < maxLength; i++) {
            linesCount = 0;
            for (int j = 0; j < list.size(); j++) {

                char[] line = list.get(j);
                if(line.length <= i){
                    writer.write("@");
                }else{
                    writer.write(line[i]);
                }
                linesCount++;
            }

        }
        writer.close();
        return linesCount;
    }
    private static void decryption(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String s = reader.readLine();
        List<char[]> strings = new ArrayList<>();
        for (int i = 0; i < maxLength; i++) {
            char[] chars = new char[linesCount];
            for (int j = 0; j < linesCount; j++) {
                if(s.charAt(linesCount*i + j) == '@') chars[j] = ' ';
                else chars[j] = s.charAt(linesCount*i + j);
            }
            strings.add(chars);
        }
        reader.close();
        String[] ss = new String[linesCount];

        for (int i = 0; i < strings.size(); i++) {

            for (int j = 0; j < strings.get(i).length; j++) {
                if(i == 0) ss[j] = "";
                ss[j] = ss[j] +  strings.get(i)[j];
            }

        }
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);

        }


    }


}
