package day37_methods;

import java.util.Arrays;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Hello from real Main Method");
        main(5);
        System.out.println(Arrays.toString(args));
    }

    public static void main(int num) {
        System.out.println(num);

    }
}
