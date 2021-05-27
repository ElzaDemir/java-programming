package SaimTasksMyPractices;
import java.util.Scanner;

public class CampusTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you time");
        double openhours = scan.nextDouble();

        if (openhours>8 || openhours<23){
            System.out.println("Open");
        }else if (openhours<8 || openhours>23){
            System.out.println("Closed");
        }else{
            System.out.println("invalid time");
        }
    }
}
