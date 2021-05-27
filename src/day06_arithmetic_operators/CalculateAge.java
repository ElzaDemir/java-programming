package day06_arithmetic_operators;

public class CalculateAge {
    public static void main (String[]args){
        int yearofBirth = 1988;
        int currentYear = 2021;
        int age = currentYear - yearofBirth;

        System.out.println("I was born in " + yearofBirth + " now is " + currentYear + ". I am " + age);

    }
}
