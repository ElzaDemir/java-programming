package day25_loops_in_java;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int n = 1; n <= 100; n++){
            if(n % 3 == 0 && n % 5 == 0){
                System.out.println(n + " FizzBuzz");
            }else if(n % 3 ==0){
                System.out.println(n + " Fizz");
            }else if(n % 5 == 0){
                System.out.println(n + " Buzz");
            }else{
                System.out.println(n);
            }
        }
    }
}
