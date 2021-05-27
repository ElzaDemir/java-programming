package day25_loops_in_java;
import java.util.*;

public class StartEnd {
    public static void main(String[] args) {
        System.out.println("Enter start number");
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        System.out.println("Enter end number");
        int end = scan.nextInt();

        for( int i = start; i < end ; i++){
            System.out.print(i + " ");
        }if(start>end){
            System.out.println("Reverse numbering is not supported");
        }
    }
}
