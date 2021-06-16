package FlipGrid;

public class Casting {
    public static void main(String[] args) {

       // IMPLICIT CASTING
        byte num1 = 10;
        short num2 = num1;


        //EXPLICIT CASTING
//        long num3 = 4444L;
//        int num4 = num3; //ERROR

        long num5 = 4444L;
        int num6 = (int)num5; //CORRECT

        //CASTING CHAR
        char letter = 'a'; //97
        int numLetter = letter;
        System.out.println(numLetter); //97

        //convert from decimal number to whole number

        double d = 11.1;
        short sh = (short)d;
        System.out.println(sh); //11

        //convert whole number into decimal

        int num = 23;
        double d1 = num;
        System.out.println(d); // 44.0

    }
}
