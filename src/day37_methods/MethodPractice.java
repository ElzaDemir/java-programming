package day37_methods;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("java", 3, '|'));
        System.out.println(repeatString("hi", 5, '~'));
    }

    public static String repeatString(String word, int times, char delimiter) {
        String returnValue = "";

        for (int i = 0; i <= times; i++) {
            if (i == times) { // if a last iteration
                returnValue += word; //add only word by itself
            } else {
                returnValue += word + delimiter; // add with delimiter
            }

            }
            return returnValue;
        }
}


