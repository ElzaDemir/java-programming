package day09_scanner_pratice;
import java.util.Scanner;

public class RemainderOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter cents: ");
        int cents = scan.nextInt();
        int dollars = cents / 100;
        int remainingCents = cents % 100;
        System.out.println("cents = " + cents);
        System.out.println("dollars= " + dollars);
        System.out.println("remainingCents = " + remainingCents);
        System.out.println("In " + cents + " cents:  " + dollars + " dollars " + remainingCents + " cents");

        System.out.println(10 / 3); //3
        System.out.println(10 % 3);
        System.out.println(10 / 5); //2
        System.out.println(10 % 5); //0 - 5+5+10
        System.out.println(20 / 7); //2
        System.out.println(20 % 7);//7+7+6. 6 here is the remainder
        System.out.println(115 % 100); // 15 remainder
        System.out.println(100 % 60);
        System.out.println(1000 / 60);
    }
}
