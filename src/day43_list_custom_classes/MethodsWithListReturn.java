package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        System.out.println(System.nanoTime());
        long start = System.nanoTime();
        List<Integer> mlnNums = getIntegerList(); // returns ready ArrayList object. No need to type new ArrayList and etc
        long end = System.nanoTime();
        System.out.println("ArrayList time = " + (end-start));
       // System.out.println(getIntegerList());


        long st = System.nanoTime();
        int arr [] = getIntegerArray();
        long en = System.nanoTime();
        double seconds = (en - st) / 1_000_000_000.0;
        System.out.println("Array time = " + (en - st));
        System.out.println("Array time seconds = " + seconds);
       // System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(arr));
    }

    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 1000_000; i++) {
            nums.add(i);
        }
        return nums;


    }

    public static int[] getIntegerArray() {
        int[] nums = new int[1000_001];
        for (int i = 0; i <= 1000_000; i++) {
            nums[i] = i;
        }
        return nums;
    }
}
