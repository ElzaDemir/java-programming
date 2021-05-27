package day42_arraylist;

import day41_arraylist_continue.ArraysAsList;

import java.util.*;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character>letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("reversed = " + letters);

        System.out.println(Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters, 'a', 'u');
        Collections.replaceAll(letters, 'i', 'j');
        System.out.println("After replace all = " + letters);

        Collections.sort(letters);
        System.out.println("After sort = " + letters);

        //INTEGER
        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 5, 23, 1, 43, 5, 234, 7, -9, 0));

        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums after reverse = " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

       int numOfFive =  Collections.frequency(nums, 5);
        System.out.println("Number of fives = " + numOfFive);

        int countOfOnes = Collections.frequency(nums, 1);
        System.out.println("Number of ones = " + countOfOnes);

        Collections.replaceAll(nums, 5, 50);
        System.out.println(" After replacing = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("After Reverse sort = " + nums);

        Collections.shuffle(nums);
        System.out.println("After shuffle = " + nums);


    }
}
