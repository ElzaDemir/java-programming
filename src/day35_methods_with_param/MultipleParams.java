package day35_methods_with_param;
import java.util.*;
public class MultipleParams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two doubles:");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();

        //Random r = new Random();         showSum(r.nextDouble(), r.nextDouble());  one of the ways, calling random
        //showSum(scan.nextDouble(),scan.nextDouble()); another way
        //showSum(23.5, 52.5);
        showSum(d1, d2);
    }
    public static void showSum(double num1, double num2){
        double sum = num1+num2;
        System.out.println("Sum value is " + sum);

    }
}
