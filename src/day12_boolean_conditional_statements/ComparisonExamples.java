package day12_boolean_conditional_statements;
import java.util.Scanner;

public class ComparisonExamples {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 45;
        System.out.println(currentSpeed < speedLimit);
        System.out.println(currentSpeed > speedLimit);

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are You Speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + " mph");

        currentSpeed += 20; //45+20 = 65
        isSpeeding = currentSpeed > speedLimit;

        System.out.println("Are You Speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + " mph");
        //increment/ increase
        double accountBalance = 250.25;
        double itemPrice = 300.99;
        System.out.println(accountBalance >= itemPrice);
        System.out.println("Can I afford? - " + (accountBalance >= itemPrice));
        boolean canafford = accountBalance >= itemPrice;
        System.out.println("canafford = " + canafford);

        //decrease balance
        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;
        boolean isBroke = accountBalance <= 0;
        System.out.println ("isBroke -" + isBroke);







    }
}