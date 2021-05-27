package day16_switch_ternary;

public class PrintChars {
    public static void main(String[] args) {
//        String word = "BREAK TILL 8:18 CT";
//        for (int i = 0; i <= word.length(); i++) {
//            System.out.print(word.charAt(i));
//        }


        String sentence = "today is java class and we are coding for loops";
        for(int n = sentence.length()-1; n>=0; n--){
            System.out.print(sentence.charAt(n));

        }

    }
}
