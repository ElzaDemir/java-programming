package day00;

import java.util.Scanner;

public class nums {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below
        for(int i = 0; i<words.length; i++){
            String currentStr = words[i];
            System.out.println(currentStr.charAt(0) +""+ currentStr.charAt(currentStr.length()-1));

        }


    }
}
