package day09_scanner_pratice;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter 2 numbers");
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = num1+num2;
        System.out.println("Result of num1 and num2 is " + result);


    }
}
