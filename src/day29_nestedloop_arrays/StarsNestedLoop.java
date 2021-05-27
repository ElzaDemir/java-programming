package day29_nestedloop_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for (int num = 1; num <= 5; num++) {
            System.out.println();
            for (int num2 = 1; num2 <= 10; num2++) {
                System.out.print("* ");
            }
        }
        System.out.println();
        for (int num = 1; num <= 10; num++) {
            for (int num2 = 1; num2 <= num; num2++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
        for (int num = 1; num <= 10; num++) {
            for (int num2 = 10; num2 >= num; num2--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
