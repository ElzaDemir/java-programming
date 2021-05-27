package day09_scanner_pratice;
import java.util.Scanner;

public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter hourly rate: ");
        double hourlyrate = scan.nextDouble();
        double weeklypay = hourlyrate * 40;
        double monthlypay = weeklypay * 52 / 12; // weeklyPay * 4; migth not be accurate
        double annualPay = monthlypay * 12;

        System.out.println("Weekly pay: " + weeklypay);
        System.out.println("Monthly pay: " + monthlypay);
        System.out.println("Annuan Pay: " + annualPay);

    }
}
