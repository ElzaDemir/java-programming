package day28_loops;
import java.sql.SQLOutput;
import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();
        String password = "";


        for (int t = 1; t <= 11; t++) {
            int index= random.nextInt(71); // it will give random number between 0-70
            password+=(source.charAt(index));
            System.out.print(source.charAt(index));
            //System.out.println(random.nextInt(source.length()));


        }
        System.out.println("\nYour password = " + password);
    }
}
