package day25_loops_in_java;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int num = 1; num<=5; num++){
            sum+=num;// sum will be 15. as it adds 0+1+2+3+4+5=15. Each time when num gets more it separately adds value.
        }
        System.out.println("sum = " + sum);
    }
}
