package SaimTasksMyPractices;

public class NumberNonEqual {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 400;
        int number3 = 50;

        if (!(number1 > 50)) {
            System.out.println("50 is bigger than " + number1);
        } else {
            System.out.println("50 less than " + number1);

            if (!(number2 < 350)) {
                System.out.println( number2 + " bigger than 350");
            } else {
                System.out.println("350 less than " + number2);
            }
            if (!(number3 == 50)) {
                System.out.println("50 is equal " + number3);
            }else{
                System.out.println("50 is not equal " + number3);
            }
        }
    }
}
