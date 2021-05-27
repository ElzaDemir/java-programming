package day09_scanner_pratice;
import java.util.Scanner;

public class TempratureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("******** TEMPRATURE CONVERTER *******");
        int fahrenheit = input.nextInt();
        double celcius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " Fahrenheit in temprature is " + celcius + " C");
    }
}
