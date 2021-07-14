package day61_exceptions;

public class CustomExceptionsTest {
    public static void main(String[] args) {
        int minutes = 70;
        System.out.println("Class is going on for " + minutes + " minutes");
        if (minutes > 50){
           // throw new BreakTimeException();
            throw new BreakTimeException("It is a break time!");
        }
        System.out.println("Let's continue class");


        int balance = 400;
        int itemPrice = 500;

        if (itemPrice > balance){
            throw new InsufficientBalanceException("Transaction Declined. Not enough funds");
        }else{
            System.out.println("Item successfully purchased");
        }
    }
}
