package com.java.se.ProgrammingLanguage.task11;

public class Task11 {
    public static void main(String[] args) {

        // 1
        Operationables op = n -> n*n;
        int k = op.calculate(10);
        System.out.println("#1");
        System.out.println(k);
        System.out.println();

        // 2
        sumArray sumArray = (ints) -> {
            int sum = 0;
            for (int i = 0; i < ints.length; i++) {
                sum += ints[i];
            }
            return sum;
        };
        int sum = sumArray.sum(new int[] {0,1,3,4,5,6});
        System.out.println("#2");
        System.out.println(sum);
        System.out.println();

        // 3
        Operational operation = (x, y) -> x/y;
        System.out.println("#3");
        System.out.println(function(100,operation,4));
        System.out.println(function(100,operation));
        System.out.println();



        // 4
        Reverse rev = (ki) -> {
            String sk = String.valueOf(ki);
            for (int i = sk.length()-1; i >= 0; i--) {
                System.out.print(sk.charAt(i));
            }
            System.out.println();
        };
        System.out.println("#4");
        rev.threeNumbers(678);
        System.out.println();

        // 5
        Expressions exes = (x,y,z) -> {
            int[] NP = new int[2];
            int[] ee = {x,y,z};
            for (int i = 0; i < ee.length; i++) {
                if(ee[i] > 0) NP[0]++;
                else if(ee[i] == 0) ;
                else NP[1]++;
            }
            return NP;

        };
        int[] NP = exes.NegPos(1,-2,3);
        System.out.println("#5");
        System.out.println(NP[0]);
        System.out.println(NP[1]);
        System.out.println();



        // 6
        System.out.println("#6");
        System.out.println(action("P").calc(10,10));
        System.out.println(action("S").calc(10,10));
        System.out.println();

        // 7
        Operations opPlus = (x) -> {
            int f = x % 10;
            int s = (x - f) / 10;
            return f + s;
        };
        Operations opMinus = (x) -> {
            int f = x % 10;
            int s = (x - f) / 10;
            return f * s;
        };
        System.out.println("#7");
        System.out.println(opPlus.calc(23));
        System.out.println(opMinus.calc(23));
        System.out.println();


        // 8
        Circle circle = (d) -> d * Circle.PI;

        System.out.println("#8");
        System.out.println(perimeter(circle,10));
        System.out.println();

    }
    public static  int function(int x, Operational operation, int y){
        return operation.calculate(x, y);
    }
    public static  int function(int x, Operational operation){
        return operation.calculate(x, 2);
    }

    private static Rectangle action(String func){
        switch(func){
            case "P": return (a, b) -> 2 * (a + b);
            case "S": return (a, b) -> a * b;
            default: return (a,b) -> 0;
        }
    }




    public static double perimeter(Circle ex,int d){
        return ex.per(d);
    }

}




// 1
interface Operationables {
    int calculate(int n);
//    int sum(int[] ints);
}

// 2
interface sumArray{
    int sum(int[] ints);
}

// 3
interface Operational {
    int calculate(int y, int x);
}

// 5
interface Expressions {
    int[] NegPos(int x, int y, int z);
}

// 4
interface Reverse{
    void threeNumbers(int k);
}
// 6
interface Rectangle {
    int calc(int a, int b);
}

// 7
interface Operations{
    int calc(int x);
}

// 8
interface Circle {
    double PI = 3.14;
    double per(int d);
}