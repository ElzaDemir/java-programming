package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {

        for (int n = 1; n <= 5; n++) {
            System.out.println(n);
            if (n == 3) {
                break;

            }
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            if (i == 2 || i == 4) {
                continue; // go to the next iteration, skip the code below
            }
            System.out.println("n = " + i);
        }
    }
}
