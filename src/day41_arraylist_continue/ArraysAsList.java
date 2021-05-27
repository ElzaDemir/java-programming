package day41_arraylist_continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = " + nums);
        //nums.add(100); .UnsupportedOperationException
        //nums.remove(0); .UnsupportedOperationException
        //nums.clear(); .UnsupportedOperationException

        List<Integer> numsList = new ArrayList<>(Arrays.asList(23, 12, 5, 4));
        numsList.add(543);
        numsList.add(2);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);
        numsList.remove(new Integer(23));
        System.out.println("Updated numsList = " + numsList);

        List<String>drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "pepsi", "mdew", "kambucha","celsius"));
        System.out.println(drinksWithCaffeine);
        int caffeineAmount = 0;
        for(String drink: drinksWithCaffeine){
            if(drink.equals("monster") || drink.equals("red bull")|| drink.equals("celsius")){
                caffeineAmount = 150;
                System.out.println(drink + " ---> " + caffeineAmount);
            }else if(drink.equals("coffee") || drink.equals("kombucha")){
                caffeineAmount = 122;
                System.out.println(drink +" ---> " + caffeineAmount);
            }else if(drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi")){
                caffeineAmount = 35;
                        System.out.println(drink + " ----> " + caffeineAmount);
            }

        }
        System.out.println();
        for(String each: drinksWithCaffeine){
            switch (each){
                case("monster"): case("red bull"): case ("celsius"):
                    caffeineAmount = 150;
                    System.out.println(each + " has " + caffeineAmount + "mg");
                    break;
                case("coffee"): case("kombucha"):
                    caffeineAmount = 122;
                    System.out.println(each + " has " + caffeineAmount + "mg");
                    break;
                case("tea"): case("coke"): case("pepsi"):
                    caffeineAmount = 35;
                    System.out.println(each + " has " + caffeineAmount + "mg");
                    break;
            }
        }
        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));
        drinksWithCaffeine.forEach(each -> {
            System.out.println("--------");
            System.out.println("each = " + each);
            System.out.println("--------");
        });


    }
}
