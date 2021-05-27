package day21_string_manipulation;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.replace("g", "h"));
        System.out.println(word.toUpperCase());
        System.out.println("word = " + word);
        
        word = word.replace("hub","lab");
        System.out.println("word = " + word);
        System.out.println(word.replace('i', 'o').replace('a', 'i'));

        String sentence="java is fun";
        String withnoSpace = sentence.replace(" ","");
        System.out.println("withnoSpace = " + withnoSpace);

        System.out.println(sentence.replace("java", "selenium").replace("fun", "a lot of fun"));
        System.out.println("sentence = " + sentence);
        String withnoSpaces = sentence.replace(" ", "");
        System.out.println("withnoSpaces = " + withnoSpaces);

        String result = "1-48 of over 4,000 results for java book";// below statement we can put in one line or separate as below.
        result= result.replace ("1-48 of over", "")
                .replace("," ,"").replace("results for java book", "");

        System.out.println(result.replace ("1-48 of over", "")
                .replace("," ,"").replace("results for java book", ""));
    }
}
