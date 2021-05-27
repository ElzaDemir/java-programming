package day25_loops_in_java;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("EVEN NUMBERS");
        for(int num = 1; num <= 100; num++ ){
            if(num % 2 == 0){
                System.out.println("num " + num);
            }
        }
        System.out.println("\nODD NUMBERS 0 - 100: ");
        for(int num2 = 1; num2<=100; num2++){
            if(num2 % 2 != 0){
                System.out.println(num2 + " num2");
            }
        }



    }
}
