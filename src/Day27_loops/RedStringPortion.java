package Day27_loops;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class RedStringPortion {
    public static void main(String[] args) {
        String list = "cat, car, cat, red car";

        for (int i = 0; i<list.length()-2; i++){
            System.out.println(list.substring(i, i+3));
            String part = list.substring(i, i+3);
            System.out.println("part = " + part);
            if (part.equals("cat") || part.equals("car")){
                System.out.println("cat or car found");

            }
        }
        //Using substring print first three numbers
//        int i = 0;
//        System.out.println(list.substring(i, i+3));
//        i++;
//        System.out.println(list.substring(i, i+3));
//        i++
//        System.out.println(list.substring(i, i+5));
//        i++;
//        System.out.println(list.substring(i, i+6));
//        i++;
    }
}
