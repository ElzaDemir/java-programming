package day24_loops;
import java.util.*;
public class GuessTheNumberGame {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Random randomNum = new Random();
//       int secretNumber = 100;
//        int guessingNumber = 0;
//
//        do {
//            System.out.println("Guess the secret Number");
//            guessingNumber = scan.nextInt();
//            if (guessingNumber > secretNumber) {
//                System.out.println("Wronng, your number is too large");
//            } else if (guessingNumber < secretNumber) {
//                System.out.println("Wrong, you number is too small");
//            }
//
//        } while(secretNumber != guessingNumber);
//
//        System.out.println( "Congratulations, you won! secret number is " + secretNumber);



        /*
        With Random. Random number used for generating numbers by computer.
         */
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNumber = randomNum.nextInt(101);
        int guessingNumber = 0;
        do {
            System.out.println("Guess the secret Number");
            guessingNumber = scan.nextInt();
            if (guessingNumber > secretNumber) {
                System.out.println("Wronng, your number is too large");
            } else if (guessingNumber < secretNumber) {
                System.out.println("Wrong, you number is too small");
            }

        } while (secretNumber != guessingNumber) ;
    }
}

