package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "Let's go to the Mountains";
        /**
         * 1)word.substring(starIndex, endIndex)
         */
        System.out.println(word.substring(0,5));
        System.out.println(word.substring(0, 8));
        System.out.println(word.substring(0, 12));
        System.out.println(word.substring(0, 16));
        System.out.println(word.substring(0, 25));
        System.out.println(word.substring(12,16));

        /**
         * 2)substring (starIndex) - it will read from start until end
         */
        System.out.println(word.substring(8));
        System.out.println(word.substring(5));
    }
}
