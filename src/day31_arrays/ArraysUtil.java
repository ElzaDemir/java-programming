package day31_arrays;
import java.util.Arrays; //or you can put * means all
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int  [] nums = {5, 9, 8, 0, 10, 20, 40, 60, 80, 30};

        System.out.println(Arrays.toString(nums));

        //sort nums
        Arrays.sort(nums);
        //print after sorting
        System.out.println (Arrays.toString(nums));

        System.out.println("min value: " + nums[0]);
        System.out.println("max valur: " + nums[nums.length-1]);

        //Arrays.sort(nums,Collections.reverseOrder());

        String [] words = {"java", "python", "c++", "sql", "ruby"};
        System.out.println(Arrays.toString(words));
        System.out.println("["+String.join(", ", words)+"]");

        //sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        //sort words in reverse order
        Arrays.sort (words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));


    }
}
