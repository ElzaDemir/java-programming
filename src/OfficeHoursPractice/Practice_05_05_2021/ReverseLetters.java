package OfficeHoursPractice.Practice_05_05_2021;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec("---olkmb.a-")); // [e d,c,b A ! $]

    }

    public static String reverseNoSpec(String str) {
        char [] letters = str.toCharArray();
        for(int i = 0, j = letters.length-1; i <= letters.length/2; i++){
            if(Character.isLetter(letters[i])){
                for (; j >= 0; j--){
                    if(Character.isLetter(letters[j])){
                        char temp = letters[i]; //A
                        letters[i] = letters[j];
                        letters[j--] = temp;
                        break;
                    }

                }

            }

        }
        //return Arrays.toString(letters).replace("[", "").replace("[", "").replace(", ", "");
        return String.valueOf(letters);


    }

    //ONE OF THE WAYs
//    int length = str.length()-1;
//    String result = "";
//
//        for (int i = 0; i < str.length(); i++) {
//        if(Character.isLetter(str.charAt(i))){
//
//            for (int j = length; j >=0 ; j--) {
//
//                if(Character.isLetter(str.charAt(j))){
//                    result+=str.charAt(j);
//                    length = j-1;
//                    break;
//                }
//            }
//        }else{
//            result+=str.charAt(i);
//        }
//    }
//        return result;

}
