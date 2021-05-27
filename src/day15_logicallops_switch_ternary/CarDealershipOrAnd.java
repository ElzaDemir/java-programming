package day15_logicallops_switch_ternary;

import java.sql.SQLOutput;

public class CarDealershipOrAnd {
    public static void main(String[] args) {
        double budget = 5000;
        String model = "Tesla";
        double carprice = 8999.0;

        if (carprice <= budget && model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla")) {
            System.out.println("Ready to buy model = " + model + ", \nPrice = " + carprice);
        } else {
            System.out.println("You do not have enough budget to buy this car " + model + ", \nPrice = " + carprice);
        }


        if (carprice <= budget && (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla"))) {
            System.out.println("Ready to buy model = " + model + ", \nPrice = " + carprice);
        } else {
            System.out.println("Not interested in model " + model + ", \nPrice = " + carprice);
        }
    }
}