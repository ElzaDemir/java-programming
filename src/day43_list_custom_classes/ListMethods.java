package day43_list_custom_classes;

import day00.nums;
import day41_arraylist_continue.ArraysAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {

        System.out.println("getDays().size () = " + getDays().size());
        System.out.println("getDays().size () = " + getDays().get(0));

        List<String>dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
        System.out.println(getDays());
        dayNames.add("java day");

        dayNames.removeIf(day -> day.length() == 6); //REMOVEIF CONDITION
        System.out.println("dayNames after removeIf = " + dayNames);

        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n < 90);
        System.out.println("nums = " + nums);

    }
    public static List<String> getDays(){
       // List<String>days = new ArrayList<>(Arrays.asList("Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"));
        List<String>days = new ArrayList<>();
        days.add("Monday"); days.add("Tuesday"); days.add("Wednesday"); days.add("Thursday");
        days.add("Friday"); days.add("Saturday"); days.add("Sunday");
        //for(String each : days){
//            days.add(each);
//        }
        return days;
    }
    public static List<Integer> getRandomList(int size){
        Random random = new Random();
        ArrayList <Integer> nums = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
//            int n = random.nextInt(101);
//            if(!nums.contains(n)){
//                nums.add(n);
//            }
            nums.add(random.nextInt(101));

        }
        return nums;
    }
}
