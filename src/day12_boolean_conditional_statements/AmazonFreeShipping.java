package day12_boolean_conditional_statements;
import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        System.out.println("Enter total price: ");
        Scanner scan = new Scanner (System.in);
        double totalPrice = scan.nextDouble();
        if (totalPrice>=25){
            System.out.println("FREE SHIPPING ELIGIBLE. Your total price: $" + totalPrice);
        }else{
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $" + totalPrice + " less than minimum of $25");
        }
        System.out.println("THANKS FOR SHOPPING AMAZON");
    }
}
