package SaimTasksMyPractices;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ElephantPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        int middle = word.length()/2;


        if (word.length()%2==0){
            System.out.println("Even word: " + word.substring(middle-1, middle+1));

        }else{
            System.out.println("Odd word: " + word.substring(middle, middle+1));
        }

    }
}
