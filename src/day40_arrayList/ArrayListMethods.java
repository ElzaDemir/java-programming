package day40_arrayList;

import java.util.ArrayList;
import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("Size = " + shoppingList.size());
        System.out.println("isEmpty = " + shoppingList.isEmpty());

        if(shoppingList.isEmpty()){
            System.out.println("List is empty keep coding java");
        }else{
            System.out.println("List is not empty");
        }
        shoppingList.add("Baklava");
        shoppingList.add("Tea");
        shoppingList.add("Tahini");
        shoppingList.add("Molasses");
        shoppingList.add("Honey");
        shoppingList.add("Cig Borek");

        if(shoppingList.isEmpty()){
            System.out.println("List is empty keep coding java");
        }else{
            System.out.println("List is not empty");
        }

        int count = shoppingList.size();
        System.out.println("Count of items = " + count);

        System.out.println("is tahini in my list? " + shoppingList.contains("Tahini"));

        if(shoppingList.contains("Cig Borek")){
            System.out.println("Yes, you have \"Cig Borek\" in your lisy");
        }else{
            System.out.println("Cig Borek is not in the list");

        }
        System.out.println("Buying pacanga boregi for $30");
        shoppingList.remove("Honey");
        System.out.println("List = " + shoppingList);

        System.out.println("Done shopping, get back to coding");
        shoppingList.clear();
        System.out.println(shoppingList);





    }
}
