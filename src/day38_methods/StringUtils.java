package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullEmpty("Guava"));
        String word = null;
        // System.out.println(word.toUpperCase()); NullPointerException
        System.out.println("isNullEmpty(word) = " + isNullEmpty(word));
        word = "";
        System.out.println("isNullEmpty(word) = " + isNullEmpty(word));
        System.out.println(reverse("java"));

    }

    public static boolean isNullEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverse(String str) {
        String reverseWord = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseWord += str.charAt(i);
        }
        return reverseWord;

    }
}
