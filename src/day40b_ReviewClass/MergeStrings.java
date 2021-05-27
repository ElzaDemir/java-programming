package day40b_ReviewClass;

import java.util.Scanner;

public class MergeStrings {

    public static String merge(String s1, String s2) {
        String result = new String();

        for (int i = 0; i < s1.length() || i < s2.length(); i++) {

            if (i < s1.length()) {
                result += s1.charAt(i); }

            if (i < s2.length())
                result += s2.charAt(i);
        }

        return result;
    }


    public static void main(String[] args)
    {
        String s1 = "abc";
        String s2 = "defgh";
        System.out.println(merge(s1, s2));
    }
}


