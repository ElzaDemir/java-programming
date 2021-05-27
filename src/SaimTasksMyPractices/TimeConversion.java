package SaimTasksMyPractices;

public class TimeConversion {
    public static void main(String[] args) {

    }
    // inout: 03:00:00AM ==> output: 03:00:00
// input: 12:00:00AM ==> putput: 00:00:00

// inout: 09:34:44PM ==> putput: 21:34:44
// input: 12:00:00PM ==> putput: 12:00:00

// String time = "09:34:44PM" ==> 21:34:44

//    public static void millitaryTime(String time) {
//
//        String millitary = "";
//        //09:00:12AM
//        if (time.contains("AM")) {
//            millitary = time.replace("AM", "");
//            // 09:00:12
//            if (time.startsWith("12")) {
//                millitary = time.replaceFirst("12", "00");
//            }
//
//            System.out.println(millitary);
//
//            // 12:00:00PM ==> 12:00:00
//            // 09:34:44PM ==> 21:34:44
//
//        } else // is just allow you to execute PM
//
//            time = time.replace("PM", ""); // 12:00:00
//
//        if (time.startsWith("12")) {  // it is PM  and it start with 12
//            millitary = time; // 12:00:00
//        } else // means it is PM but, it doesnt start with 12
//
//            //     09:34:44PM ==> 21:34:44
//            // String name = "MJ";
//            String hour = time.substring(0, time.indexOf(":")); //==> //first way // 09
//
//        String[] timeArray = time.split(":");// ==> // {09 , 34, 44}
//
//        int hourInt = Integer.parseInt(timeArray[0]); //==> // 9
//        hourInt += 12;
//
//        timeArray[0] = "" + hourInt; //==> "21"
//
//        timeArray[0] = Integer.toString(21);
//
//        timeArray[0] = Integer.toString(Integer.parseInt(timeArray[0]) + 12);
//
//        // {21 , 34, 44} // 213444
//
//        millitary = String.join(":", timeArray);
//
//        System.out.println(millitary);
//        // 21:34:44
//
//    }
}
