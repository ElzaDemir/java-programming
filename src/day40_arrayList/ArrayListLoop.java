package day40_arrayList;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); //Polymorphic way
        System.out.println(nums);
        System.out.println("nums.size() = " + nums.size());
        
        nums.add(34); nums.add(33); nums.add(32); nums.add(31);
        nums.add(30); nums.add(29); nums.add(28); nums.add(27);
        nums.add(25); nums.add(24); nums.add(23); nums.add(22);

        System.out.println("nums = " + nums);
       // nums.remove(0);
        System.out.println("nums = " + nums);
        System.out.println("nums.size() = " + nums.size());

        //nums.remove(33); indexOutOfBoundException
        nums.remove(new Integer(33));
        System.out.println("nums = " + nums);

        nums.remove(new Integer(22));
        System.out.println("nums = " + nums);

        //for loop = iterate through all values and print
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));

            for (int each: nums){
                System.out.print(each + " ");
            }

        }


        
        

    }
}
