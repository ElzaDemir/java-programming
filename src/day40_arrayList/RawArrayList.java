package day40_arrayList;

import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        //Declare raw arrayList

        ArrayList list1 = new ArrayList(); // raw way to declare array
        List list2 = new ArrayList(); //polymorphic way of declaring

        //add values
        list1.add("java");
        list1.add(1 + " veggie smoothie");
        list1.add(1 + " cup of turkish coffee");
        list1.add(2 + " baklava");
        list1.add(1 + " plate of plov");
        list1.add(3.5 + " qutab");
        list1.add(1234);
        list1.add(55.2);
        list1.add(true);

        System.out.println(list1);
        System.out.println(list1.size());


    }
}
