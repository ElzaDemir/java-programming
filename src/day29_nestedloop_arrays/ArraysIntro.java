package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //int num; // single variable

        //array variable
        int[] nums = new int [3] ;
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;
        // print values of array
        System.out.println("value at index 0 = " + nums[0]);
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);
        
        //we can also use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]); //10

        //how to find out the size fo the array
        System.out.println("number of elements = " + nums.length);

        //store length of array into variable
        int len = nums.length;

        // change  values in the array
        nums[0] = 5;
        nums[1] = 10;
        //read the value of index 1 and assign same to index 2
        nums[2] = nums[1];

        System.out.println("nums [0] = " + nums[0]);
        System.out.println("nums [1] = " + nums[1]);
        System.out.println("nums [2] = " + nums[2]);
    }
}
