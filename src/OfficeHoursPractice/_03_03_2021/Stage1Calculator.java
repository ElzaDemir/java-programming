package OfficeHoursPractice._03_03_2021;

public class Stage1Calculator {
    public static void main(String []  args) {
        double num1 = 5.0;
        double num2 = 10.0;

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double remainder = num1 % num2;

        System.out.println("Calculations for " + num1 + " & " + num2);
        System.out.println(num1 + " + " + num2 + " = " + addition + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + subtraction + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " % " + num2 + " = " + remainder);


    }
}
