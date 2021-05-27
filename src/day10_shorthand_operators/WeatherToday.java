package day10_shorthand_operators;
import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is weather today?");
        //String weather = scan.next();
        String weather = scan.nextLine();
        System.out.println(weather + "- ohhhh what a nice weather today");

    }
}
