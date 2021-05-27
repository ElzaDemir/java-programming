package day00;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        String input = "today it will be 100 degrees";
        int n = 0;

        while(n++ < input.length()){

        if(n == 8) {
            continue;
        }else if (n == 9){
            break;
        }
            System.out.println(input.charAt(++n));
        }
        }
}
