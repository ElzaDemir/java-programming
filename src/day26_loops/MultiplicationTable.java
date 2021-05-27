package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 5;
        if (number > 1 || number > 10) {
            System.out.println("Invalid number");
            //return;  <= means exit the main method/
        }

        for (int i = 1; i <= 10; i++) {
            int sum = number * i;
            System.out.println(i + " x " + number + " = " + (number * i));

            }
        }
    }




