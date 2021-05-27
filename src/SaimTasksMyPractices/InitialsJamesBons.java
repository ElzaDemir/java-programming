package SaimTasksMyPractices;
import java.util.Scanner;

public class InitialsJamesBons {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter sentence:");
        String sentence = scan.nextLine();
        int firstword = sentence.indexOf(' ');
        System.out.println(sentence.substring(firstword+1) + " "+sentence.substring(0,firstword));
    }
}
