package day59_polymorphism_exceptions.runtime_exceptions;

/**
 * RUNTIMEEXCEPTION
 */

public class RuntimeErrorExample {
    public static void main(String[] args) {
        System.out.println(10 / 2);
        int [] num = {4,6,10};
        System.out.println(num [0]);
        System.out.println(num [3]); // ---> this is out of ArrayList. Given ERROR: ArrayIndexOutOfException
        System.out.println(10 / 0);
        System.out.println(10 / 3);
    }
}
