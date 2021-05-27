package day38_methods;
import java.util.*;
public class ArrayUtils {
    public static void printArray(int[]nums) {
        for(int num: nums) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
    public static int sum(int[]nums){
        int total = 0;
        for(int each: nums){
            total+=each;
        }
        return total;
    }
    public static boolean contains(int[] nums, int n){
        //boolean found = false;
        for(int each: nums){
            if(each==n){
                //found = true;
                break;
            }
        }
        return true;
    }
    public static boolean equals(int[] number1, int []number2){
        boolean checknum = false;
        if (Arrays.equals(number1,number2)){
            checknum = true;
        }
        return checknum;

    }

}