package day40_arrayList;
import java.util.*;
public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(9);
        nums.add(8);
        nums.add(8);
        nums.size();

        System.out.println("nums = " + nums);
        System.out.println("size = " + nums.size());
        System.out.println("index zero = " + nums.get(0));
        System.out.println("index one = " + nums.get(1));
        System.out.println("index two = " + nums.get(2));
        System.out.println("index three = " + nums.get(3));
        //System.out.println("index zero = " + nums.get(4)); // indexOutOfBoundException

        System.out.println(nums);

        nums.remove(1); //remove element at index 1
        System.out.println(nums);




    }
}
