package SaimTasksMyPractices;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
          System.out.println("Program to check Body  Mass Index");
        System.out.println("============================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your mass (Kg)");
        double weight = scan.nextDouble();
        System.out.println("Enter your height (meter)");
        double height = scan.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your Body Mass Index " + bmi);

         if (bmi < 18.5) {
            System.out.println("Underweight");
             System.out.println("Please take care of your weight and health! ");
        }else if (bmi > 18.5 && bmi < 25) {
            System.out.println("Normal weight");
             System.out.println("Congratulation! Your weight and height is perfect.");
        }else if (bmi >= 25 && bmi <= 30) {
            System.out.println("Overweight");
             System.out.println("You need a diet plan");
        }else{
            System.out.println("Obese");
             System.out.println("You need a diet plan and physical movements.");
        }
    }
}
//bmi > 18.5 &&  bmi >= 25 &&