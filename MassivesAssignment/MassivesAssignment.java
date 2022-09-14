package com.java.se.ProgrammingLanguage.MassivesAssignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MassivesAssignment {
    public static void main(String[] args) {


        //Matrix

        int[][] ints = new int[10][10];

        for(int i = 0; i < ints.length;i++){
            for(int j = 0; j < ints[i].length;j++){
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                ints[i][j] = t;
            }
        }

        int[][] ints1 = new int[10][10];
        for(int i = 0; i < ints1.length;i++){
            for(int j = 0; j < ints1[i].length;j++){
                int t = (int) (Math.random() * 100);
                ints1[i][j] = t;
            }
        }

        for(int i = 0; i < ints1.length; i++){
            Arrays.sort(ints1[i]);
        }

        for(int i = 0; i < ints1.length;i++){
            for(int j = 0; j < ints1[i].length;j++){
            }
        }




        //1
        int[] firstlastOne = new int[0];
        task1(firstlastOne);


        //2
        int[] zeroOnes = new int[10];
        task2(zeroOnes);



        //3
        int[] odds = new int[10];
        task3(odds);


        //4

        int[] arpr = new int[10];
        task4(arpr);



        //5
        int[] evens = new int[10];
        task5(evens);


        //6
        int[] sample = new int[10];
        task6(sample);

        //7
        task7();


        //8
        int[] randomArray = randomArray(10,1000);
        task8(randomArray);

        //9
        task9(randomArray);


        //10
        task10(randomArray);

        //11
        task11(randomArray);

        //12
        task12(randomArray);


        //13
        task13(randomArray);

    }

    public static int[] randomArray(int n,int range){
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * range);
        }
        return array;
    }

    public static int[] task1(int[] arr){

//        Заполнить массив нулями, кроме первого и последнего элементов, которые
//        должны быть равны единице

        if(arr.length < 1) return arr;

        for(int i = 1; i < arr.length-1;i++){
            arr[i] = 0;
        }
        arr[0] = 1;
        arr[arr.length-1] = 1;
        return arr;
    }

    public static int[] task2(int[] arr){

//        Заполнить массив нулями и единицами, при этом данные значения чередуются,
//        начиная с нуля.

        boolean b1 = true;
        for(int i = 0; i < arr.length;i++){
            if(b1) {
                b1 = false;
                arr[i] = 0;
            }
            else {
                b1 = true;
                arr[i] = 1;}
        }
        return arr;
    }

    public static int[] task3(int[] arr){

//        Заполнить массив последовательными нечетными числами, начиная с единицы.

        int counter = 1;

        for(int i = 0; i < arr.length;i++){
            arr[i] = counter;
            counter+=2;
        }

        return arr;
    }

    public static int[] task4(int[] arr){

//        Сформировать массив из элементов арифметической прогрессии с заданным
//        первым элементом x и разностью d

        Scanner sc = new Scanner(System.in);
        System.out.print("x:");
        int x1 = sc.nextInt();
        System.out.print("d:");
        int d = sc.nextInt();

        for(int i = 0; i < arr.length;i++){
            arr[i] = x1;
            x1+=d;
        }

        return arr;
    }

    public static int[] task5(int[] arr){

//        Сформировать возрастающий массив из четных чисел.

        for(int i = 0; i < arr.length;i++){
            int ran = (int) (Math.random() * 100);
            if(ran % 2 == 0) arr[i] = ran;
        }
        Arrays.sort(arr);

        return arr;
    }

    public static int[] task6(int[] arr){

//        Сформировать убывающий массив из чисел, которые делятся на 3.


        for(int i = 0; i < arr.length;i++){
            arr[i] = randomIntegerDiv(3);
        }
        Integer[] integers = new Integer[arr.length];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = arr[i];
        }
        Arrays.sort(integers, Collections.reverseOrder());
        for (int i = 0; i < integers.length; i++) {
            arr[i] = integers[i];
        }


        return arr;
    }

    public static int randomIntegerDiv(int div){

        while(true){
            int t = (int) (Math.random() * 1000);
            if(t % div == 0) return t;
        }
    }

    public static int[] task7(){

//        Создать массив из n первых чисел Фибоначчи

        System.out.print("N(Fibonacci):");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        int a = 0;
        int b = 1;
        int c = 1;

        for(int i = 0; i < n;i++){
            arr[i] = a;
            a = b;
            b = c;
            c = a + b;
        }

        return arr;
    }
    public static int task8(int[] arr){

//        Найти количество четных чисел в массиве.

        int evencount = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] % 2 == 0) evencount++;
        }

        return evencount;
    }
    public static int task9(int[] arr){

//        Найти количество чисел в массиве, которые делятся на 3, но не делятся на 7

        int cou = 0;
        for(int i = 0; i < arr.length;i++){
            if((arr[i] % 3 == 0) & arr[i] % 7 != 0) cou++;
        }

        return cou;
    }
    public static void task10(int[] arr){

//        Определите, каких чисел в массиве больше: которые делятся на первый элемент
//        массива или которые делятся на последний элемент массива.

        int first = arr[0];
        int last = arr[arr.length-1];
        int firstcount = 0;
        int lastcount = 0;
        for(int i = 1; i < arr.length - 2; i++){
            if(arr[i] % first == 0) firstcount++;
            if(arr[i] % last == 0) lastcount++;
        }
        System.out.println(firstcount != lastcount ? firstcount > lastcount ? "more first":"more last":"equal");

    }
    public static void task11(int[] arr){

//        Найдите сумму и произведение элементов массива.

        int sum = Arrays.stream(arr).sum();
        int notsum = 1;
        for(int i = 0; i < arr.length;i++){
            notsum *= arr[i];
        }
        System.out.println("sum:" + sum);
        System.out.println("product:" + notsum);

    }
    public static int task12(int[] arr){

//        Найдите сумму четных чисел массива.

        int evenSum = Arrays.stream(arr).filter(i -> i % 2 == 0).sum();

        return evenSum;
    }
    public static int task13(int[] arr){

//        Найдите сумму нечетных чисел массива, которые не превосходят 11.

        int oddSum = Arrays.stream(arr).filter(i -> i % 2 != 0 && i <= 11).sum();

        return oddSum;
    }
}
