package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {

//        double sum = add (5,6);             this is also one of the ways to do prints below
//        System.out.println("5 + 6 =" + 5+6);
//        System.out.println("sum = " + sum);


        System.out.println(add(5.25, 3.5));
        System.out.println("5.25 + 3.5 = " + (5.25+3.5));
        System.out.println(minus(5.5, 3.5));
        System.out.println("5.5 - 3.5 = " + (5.5-3.5));
        System.out.println(multiply(8.5,6.5));
        System.out.println("8.5 * 6.5 = " + (8.5*6.5));
        System.out.println(divide(15,3));
        System.out.println("15 / 3 = " + (15/3));


    }
    public static double add (double num1, double num2){
        double result = num1 + num2;
        return result; // or you can do return num1+num2
    }
    public static double minus (double num2, double num3){
        double result1 = num2 - num3;
        return result1;
    }
    public static double multiply(double num4, double num5){
        double result2 = num4 * num5;
        return result2;
    }
    public static double divide (double num6, double num7){
        double result3 = num6/num7;
        return result3;
    }
}
