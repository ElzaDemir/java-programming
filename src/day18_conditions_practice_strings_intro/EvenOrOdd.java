package day18_conditions_practice_strings_intro;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num % 2);
        System.out.println(num % 2 == 0);

        if(num % 2 == 0){
            System.out.println(num + " - Even number");
        }else{
            System.out.println(num + " - Odd number");
        }
    }
}

