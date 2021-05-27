package day09_scanner_pratice;

public class SalaryCalculator {
    public static void main(String[] args) {
        System.out.println("Enter hourly rate: ");
        double hourlyrate = 55.5;
        double weeklypay = hourlyrate * 40;
        double monthlypay = weeklypay * 52 / 12; // weeklyPay * 4; mign not be accurate
        double annualPay = monthlypay * 12;


        System.out.println("Weekly pay: " + weeklypay);
        System.out.println("Monthly pay: " + monthlypay);
        System.out.println("Annuan Pay: " + annualPay);







    }

}
