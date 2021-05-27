package day09_scanner_pratice;
import java.util.Scanner;

public class SpeeCheckV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Over the Limit");
        double speedlimit  = scan.nextDouble();
        double currentspeed = 75;
        double overTheLimit = currentspeed - speedlimit;

        System.out.println("You are over the limit for "+ overTheLimit + " mph. Slow Down!");
    }
}
