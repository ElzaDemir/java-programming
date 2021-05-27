package day10_shorthand_operators;
import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        System.out.println("Rent for the apartmet");
        Scanner scan = new Scanner(System.in);
        double rent = scan.nextDouble();
        String month = scan.nextLine();
        scan.nextLine(); //fix the known bug. WROK - AROUND
        System.out.println("rent = " + rent);
        System.out.println("month = " + month);
        //System.out.println("The rent for the month of\n " + month + " is $" + rent);

    }
}
