package day00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        //REMOVE METHOD
        nums.remove(3);
        //above - after removing (3) ---> 1,2,3,5
        System.out.println(nums.remove(3));
        //above - after removing (3) ---> 5 printed also removed
        System.out.println(nums);
        //above - after removing ---> 1, 2, 3
        nums.remove("3"); //returns boolean
        //above - will return false as there is not object in arraylist
        System.out.println(nums.remove(new Integer(1))); //will return boolean and will be true
        //above - will return true and remove number 1 as there is number 1 in the list. not index 1, number 1
        System.out.println(nums.remove(new Integer(6))); //returns boolean
        //above - will return false as there is not digit 6
        System.out.println(nums);
        System.out.println(nums.remove("3"));

        ArrayList<String> words = new ArrayList<>(Arrays.asList("mj", "rahib", "Meerim", "max"));
        System.out.println(words.contains("ramin"));
        System.out.println(words.indexOf("rahib"));
        System.out.println(words.remove(3));
        //System.out.println(words.remove(4)); //IndexOutOfBoundsException

        System.out.println("----------------------------------------------------------------------------------------------");

        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(100); //[100]
        numbers.add(-2); //[100, -2]
        numbers.remove(1); //[100]
        numbers.add(1, 25); //[100, 25]
        numbers.add(numbers.remove(0));
        System.out.println(numbers);
        //[25, 100]

        System.out.println("----------------------------------------------------------------------------------------------");

         ArrayList<String> names = new ArrayList<>(Arrays.asList("Andy", "Bart", "Carl", "Elmo"));
         names.add(names.remove(2)); //[Andy, Bart, Elmo, Carl]
         names.set(names.indexOf("Andy"), names.remove(2)); //[Elmo, Bart, Carl]
        //above line - names.set(0, Elmo)
         System.out.println(names);

         //SET METHOD  - names.set - is a method which replace a value in specific index with another value
        //but also it will return the original value of that index
        //set is method that accepts two parameters (index, value)
        //two action happen at the same time:
        //1) method will replace whatever we hae in the index with value
        //2) it will return the original value of the that index (before replacing)

        System.out.println("----------------------------------------------------------------------------------------------");

        ArrayList<String>list = new ArrayList<>();
        list.add("Andy");
        list.add("Bart");
        list.add("Carl");
        list.add("Elmo");

        list.add(2, "mj"); //[Andy, Bart, mj, Carl, Elmo]
        list.remove(4); //[Andy, Bart, mj, Carl]
        list.set(3, "Andy"); //[Andy, Bart, mj, Andy]
        //above - it will return the original value of index3 = carl. We don't see that as we need to print it.
        list.remove(list.set(0, "mohammad")); //[mohammad, bart,mj,Andy], [Andy, Bart, mj, Andy]
        System.out.println(list.set(0, "mohammad"));
        //list.remove(Andy);
        System.out.println(list); //[mohammad, bart,mj]

        //SET METHOD  - names.set - is a method which replace a value in specific index with another value
        //but also it will return the original value of that index
        //set is method that accepts two parameters (index, value)
        //two action happen at the same time:
        //1) method will replace whatever we hae in the index with value
        //2) it will return the original value of the that index (before replacing)


        System.out.println("----------------------------------------------------------------------------------------------");

        //COLLECTIONS CLASS:
        //is a utility class in Java to help with many common operation with ArrayList
        //Useful methods:
        // - sort
        // - reverse
        // - frequency
        // - min, max
        // - replaceAll
        // - shuffle
        Collections.sort(words); //we need to use here ArrayList






    }
}
