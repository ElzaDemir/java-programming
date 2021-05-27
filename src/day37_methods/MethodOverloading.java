package day37_methods;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading.sum(10, 5);  // you cannot put class name doesnt matter
        sum(2, 3, 5);
        sum(2.5, 3.5);
        sum(2.5, 3.5);
        sum((int)4.2, 2, 3); //casting int int int below
        sum("Java", "class");


    }
    public static void sum(int num1, int num2){
        System.out.println("sum(int, int)");
        System.out.println("Result = " + (num1 + num2));
        System.out.println();
    }
    public static void sum(int num1, int num2, int num3){
        System.out.println("sum(int, int, int)");
        System.out.println("Result = " + (num1 + num2+ num3));
        System.out.println();
    }
    public static void sum(double num1, double num2){
        System.out.println("sum(double, double)");  // just to see nothing serious. to see when printing
        System.out.println("Result = " + (num1 + num2));
        System.out.println();
    }
    public static void sum(String str1, String str2){
        System.out.println("sum(string, string)"); //this is the signature
        System.out.println("Result = " + str1 + str2);
    }

    }
