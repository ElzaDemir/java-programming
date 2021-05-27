package day09_scanner_pratice;


import java.util.Scanner;

public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("******** MILES TO KM CONVERTER ********");
        double miles = scan.nextDouble();
        double kilometers = miles * 1.609;
        System.out.println(miles + " Miles in kilometers " + kilometers + " km.");
    }
}
