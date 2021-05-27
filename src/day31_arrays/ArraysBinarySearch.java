package day31_arrays;

import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String[] args) {
        int [] nums = {11, 22, 33,  55, 12345, 400};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        //Binary Search
        System.out.println(Arrays.binarySearch(nums,55));
        System.out.println(Arrays.binarySearch(nums,123));
        System.out.println(Arrays.binarySearch(nums,44));
        System.out.println(Arrays.binarySearch(nums,700));

        //check if number 12345 is among numbers in array

        if(Arrays.binarySearch(nums,12345)>=0){
            System.out.println("12345 is present in array");
        }else{
            System.out.println("12345 is not present");
        }
    }
}
