package day11_comparison_operators;

import java.sql.SQLOutput;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        //PRE-INCREMENT
        int num1 = 10;
        int num2 = ++num1;
        System.out.println("num1 = " + num2);// answer is 11
        System.out.println("num2 = " + num2);//answer is 11
        
        //POST-INCREMENT
        //int num3 = 8;
       // int num4 = num3;
        //num3++;
        int num3 = 20;
        int num4 = num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int cars = 5;
        System.out.println(++cars);//6
        int sedan = 10;
        System.out.println(sedan++); //10
        System.out.println("sedan = " + sedan); //11

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println(a);//51
        System.out.println(b);//23
        System.out.println(c);//73


    }
}
