package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        //System.out.println(word.charAt(4)); When you'll run it, it will show ERROR
        System.out.println(word + "-" + word.length());

        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(0));
        System.out.println("second letter: " + company.charAt(1));
        System.out.println("third letter: " + company.charAt(2));
        System.out.println("fourth letter: " + company.charAt(3));
        System.out.println("fifth letter: " + company.charAt(4));
        System.out.println("sixth letter: " + company.charAt(5));
        System.out.println("seventh letter: " + company.charAt(6));
        System.out.println("eighth letter: " + company.charAt(7));

        char first = company.charAt(0);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char fourth = company.charAt(3);
        char fifth = company.charAt(4);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eighth = company.charAt(7);

        System.out.println(first + " * " + second + " * " + third + " * " + fourth + " * " + fifth + " * " + sixth + " * " + seventh + " * " + eighth);

        String word1 = "mom";
        if (word1.charAt(0) == word1.charAt(2)) {
            System.out.println("First and third letter are the same");
        } else {
            System.out.println("First and last letters don't match");
        }
        String friend = "aziza";
        char firstLetter = friend.charAt(0);
//        int count = friend.length();                   //another most common way to do it
//        char lastLetter = friend.charAt(count-1);
        char lastLetter = friend.charAt(friend.length()-1);
        System.out.println("lastLetter = " + lastLetter);
        System.out.println("firstletter " + firstLetter);

        if (firstLetter==lastLetter){
            System.out.println("It matches");
        }else{
            System.out.println("don't match");
        }
    }
}
