package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 3;
        System.out.println("count = " + count);
        // add two more to the count/ increase
        count = count+2;
        System.out.println("count = " + count);

        int apples = 30;
        System.out.println("apples = " + apples);
        apples = apples+10;
        System.out.println("Apples = " + apples);
        apples = apples-3;
        System.out.println("Apples = " + apples);
        int pizzaSlices = 8;
        System.out.println("Pizza slices = " + pizzaSlices);
        pizzaSlices = pizzaSlices / 2;
        System.out.println("Pizza Slices = " + pizzaSlices);
        pizzaSlices = pizzaSlices + 6;
        System.out.println("Pizza Slices = " + pizzaSlices);

        int players = 10;
        System.out.println("platers = " + players);
        players = players * 2;
        System.out.println("Players = " + players);

        int cents = 568;
        System.out.println("Cents = " + cents);
        cents = cents % 100;
        System.out.println("remaining cents = " + cents);
    }
}
