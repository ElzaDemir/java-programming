package day42_arraylist;

import java.beans.beancontext.BeanContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
//        List<String> words = new ArrayList<>();
//        words.add("java"); words.add("html"); words.add("selenium");
//        words.add("a"); words.add("input"); words.add("title");
//        printStrList(words);
        printStrList(Arrays.asList("java", "html", "selenium", "a", "input", "title"));
        /**
         * MethodName: printStrList
         * param: List of Strings
         * return: void
         * prints all values separated by space in the same line
         */
        sumIntegerList(Arrays.asList(2, 5, 6, 4, 8));

        List<Integer> nums = Arrays.asList(23,54,54,32,23);
        System.out.println(nums);
        //sumIntegerList(nums);
        int sum = sumIntegerList((nums));
        System.out.println(sum);

    }
    public static void printStrList (List<String> stringList){
        //
        for(String str: stringList){
            System.out.print(str + " ");
        }
        System.out.println();
    }
/////////////////////////////////////////////////////////////////////////////////

    public static int sumIntegerList (List<Integer>integerList){
        int sum = 0;
        for(int each: integerList){
            sum+=each;

        }

        return sum;
    }

}
