package day32_arrays_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java:python:selenium:html";
        String[] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of word array = " + wordsArray.length);

        for (String each: wordsArray){
            System.out.println(each);
        }
        String sentence = "today I am coding java arrays";
        String[] wordInSentence = sentence.split(" ");
        System.out.println("first word: " + wordInSentence[0]);
        System.out.println("first word: " + sentence.split(" ")[0]);
        System.out.println(Arrays.toString(wordInSentence));
        System.out.println("Number of words in sentence = " + wordInSentence.length);
        for(String each : wordInSentence){
            System.out.println(each);
        }

    }
}
