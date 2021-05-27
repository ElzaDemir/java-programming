package day36_methods_with_return;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
        System.out.println("Full Name: " + fullName());
        System.out.println("Is Married: " + isMarried());
        System.out.println("Age: " + getAge());
        System.out.println("Birth year" + getRandomYear());

        String name = fullName();
        boolean married = isMarried();
        int year = getRandomYear();

        System.out.println("fullName() = " + fullName());
        System.out.println("year = " + year);
        System.out.println("married = " + married);



    }
    public static String fullName(){
        System.out.println("Print your full name"); //but we can print before return statement
        return "Mike Smith";
        //System.out.println("full name"); //we cannot print after return statement
    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        int age = 35;
        return age;
        //return 35; you can also do like this
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
