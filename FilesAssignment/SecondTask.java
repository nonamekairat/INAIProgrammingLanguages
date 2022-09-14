package com.java.se.ProgrammingLanguage.FilesAssignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SecondTask {

    public static void main(String[] args) throws IOException {

        /**
        В текстовый файл занесены пары чисел, разделенных пробелом (каждая пара
        чисел – в новой строке). Рассматривая каждую пару как координаты точек на
        плоскости, найти наибольшее и наименьшее расстояния между этими точками.
         */


        String path = "Files/test.txt";

        ArrayList<int[]> coordinates = getCoordinates(path);
        double max = 0;
        double min = 0;

        for(int i = 0; i < coordinates.size();i++){

            for (int j = i+1; j < coordinates.size(); j++) {

                double x1 = Math.pow(coordinates.get(i)[0] - coordinates.get(j)[0],2);
                double y1 = Math.pow(coordinates.get(i)[1] - coordinates.get(j)[1],2);

                double distance = Math.sqrt(x1 + y1);

                if(j == 1){
                    max = distance;
                    min = distance;
                }
                if(distance > max) max = distance;
                if(distance < min) min = distance;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }


    public static ArrayList<int[]> getCoordinates(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        ArrayList<int[]> arrayList = new ArrayList<>();
        while(reader.ready()){
            int[] coordinate = new int[2];
            String line = reader.readLine();
            String [] tokens = line.split(" ");
            for (int i = 0; i < tokens.length; i++) {
                coordinate[i] = Integer.parseInt(tokens[i]);
            }

            arrayList.add(coordinate);
        }
        reader.close();
        return arrayList;
    }


}
