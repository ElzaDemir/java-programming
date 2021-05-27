package day24_loops;
import java.util.*;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to your account");
        int pinCode;
        int secretPincode = 1234;

        do {
            System.out.println("Enter you PinCode");
            pinCode = scan.nextInt();


        }while(secretPincode!=pinCode);
        System.out.println("Your pin is correct");


    }
}
