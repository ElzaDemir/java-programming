package day33_arrays;

import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {
        String word = "ajavajav";
        String[] array = word.split("a");
        System.out.println(array.length);
        int countOfA = array.length - 1;
        if (word.endsWith("a")) { //if ends with a, add one more
            countOfA++;
        }
        System.out.println("count of A = " + countOfA);

        String word2 = "java1sql2html";
        String[] strArr2 = word2.split("\\d");
        System.out.println(Arrays.toString(strArr2));

        word2 = word2.replaceAll("\\d", "_");
        System.out.println(("word = " + word2));

        String password = "Abcd123_5";
        if (password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
