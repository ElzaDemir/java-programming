package day29_nestedloop_arrays;

import java.sql.SQLOutput;

public class StringInLoop {
    public static void main(String[] args) {
        String word = "java";
//        for (int i = 0; i < word.length(); i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.println(word.charAt(j));
//            }
//            System.out.println();
//        }
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }

    }
}
