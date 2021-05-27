package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("add 10 + 45 = " + Calculator.add(10, 45));
        System.out.println("100 - 40 = " + Calculator.minus(100, 40));
        System.out.println("55 / 4 = " + Calculator.divide(55, 4));
        System.out.println("50 * 5 = " + Calculator.multiply(50, 5));

        double d1 = 634.3;
        double d2 = 321.5;
        double result = Calculator.minus(d1, d2);
        System.out.println("Result = " + result);

    }
}
