package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java"; //in string pool
        String word2 = "java"; //re-use from string pool
        String word3 = new String("java"); //create in HEAP, outside String pool

        System.out.println(word1 == word2); //TRUE
        System.out.println(word1 == word3); //FALSE

    }
}
