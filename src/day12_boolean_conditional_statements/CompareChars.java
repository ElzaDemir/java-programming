package day12_boolean_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1, letter2;
        letter1 = 'A';
        letter2 = 'J';
        System.out.println(letter1 > letter2); //65==74
        System.out.println(letter1 < letter2);
        System.out.println(letter1 == letter1);

        char grade = 'E';
        boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam? - " + pass);





    }

}
