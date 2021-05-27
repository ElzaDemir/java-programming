package day37_methods;
import java.util.*;
public class DaySelector {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
//        System.out.println("Enter day:");
//        int day = scan.nextInt();
//        System.out.println(getDayName(day));
        System.out.println(getDayName(5));
        for (int i = 0; i < 8; i++) {
            System.out.println(getDayName(i));
        }
        //Store getDayName into variable, and print variable

        String today = getDayName(6);
        System.out.println("Today is " + today);
        String someDay = getDayName(0);
        if (someDay==null){
            System.out.println("someDay is null, invalid day");
        }
    }

    public static String getDayName(int day) {
        switch (day) {
            case 1:
                return "Monday";  //break;//unreachable code, because return already exits the method
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                System.out.println("ERROR: Invalid date");
                return null; //nothing, no value
            //instead of doing below you can do it with return as above
//            case 1:
//                System.out.println("Monday");
//                break;//unreachable code, because return already exits the method
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid date");
//        }
//        return "";
        }
    }
    //ANOTHER VERSION OF DOING THE SAME TASK WITH DAYS
    public static String getDayV2(int day){
        String dayName;
        switch(day){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid day");
                dayName = null;
        }
        return dayName;
    }
}