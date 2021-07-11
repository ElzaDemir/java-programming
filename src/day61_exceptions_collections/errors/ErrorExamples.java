package day61_exceptions_collections.errors;

import java.util.ArrayList;
import java.util.List;

/**
 * Normally we shouldn't catch errors like below,
 * instead, we should make the code as buggy and fix it to prevent errors like this
 */

public class ErrorExamples {
    public static void main(String[] args) {
        //StackOverFlowError
        try {
            myMethod();
        } catch (StackOverflowError error) {
            System.out.println("");
        }
        System.out.println("--AFTER ERROR");

        //OutOfMemoryError
        List<Integer>nums = new ArrayList<>();
        while(true){
            nums.add(100);
        }
    }

        static int counter = 0;

        public static void myMethod () {
            System.out.println(counter++);
            myMethod();


        }
}