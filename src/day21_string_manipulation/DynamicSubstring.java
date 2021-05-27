package day21_string_manipulation;

import java.sql.SQLOutput;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        System.out.println(result.substring(13));

        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));

        System.out.println(result.substring(result.indexOf(":")));

        String today = "I learn [java] today";
//        System.out.println(today.indexOf("["));
//        System.out.println(today.indexOf("]"));
//        System.out.println(today.substring(9, 14));

        //BEST WAY IS BELOW

        System.out.println(today.substring(today.indexOf("[")+1, today.indexOf("]")));

    }
}
