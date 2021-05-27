package day13_conditional_statements;

public class salesAmount {
    public static void main(String[] args) {
        double bonus = 0.0;
        double salesAmount = 5000.00;

        if (salesAmount <= 2000) {
            bonus = 50;
            System.out.println("Good job, you qualified for $" + bonus);
        } else {
            bonus = 100;
            System.out.println("Great job, you are qualified for full $" + bonus);
            System.out.println("");
        }
        System.out.println("Your bonus for sales : $" + bonus);
    }
}
