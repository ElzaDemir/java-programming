package day59_polymorphism_exceptions.runtime_exceptions;

public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);
            System.out.println(10 / 0);
            System.out.println(10 / 3);

        }catch (Exception e){
            System.out.println("RuntimeException happened and handled");
        }
        System.out.println("After first try catch");



        try {

            int[] num = {4, 6, 10};
            System.out.println(num[0]);
            System.out.println(num[3]); // ---> this is out of ArrayList. Given ERROR: ArrayIndexOutOfException

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException is caught and handled");

        }
        System.out.println("After Array code");
    }
}
