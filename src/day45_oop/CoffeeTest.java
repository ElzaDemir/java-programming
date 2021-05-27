package day45_oop;

import javafx.application.ConditionalFeature;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drinking 10 = " + myCoffee.getAmount());

        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee = " + myCoffee.getType());
        //describe myCoffee
        System.out.println(myCoffee.toString());

        //ADD ANOTHER COFFEE OBJECT, SET VALUES, CALL METHODS

        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());
        //assign coffee1 object to coffee2
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type = " + coffee2.getType());
        coffee2.setType("Espresso");

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappuccino");
        coffee3 = coffee2;
        System.out.println("coffee3 type = " + coffee3.getType());

        Coffee coffee4 = null; //reference variable does not refer/ point to any object in HEAP
        coffee4.setType("turkish");
    }
}
