package day18_conditions_practice_strings_intro;

public class ThreeNumbers {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 1000;
        int num3 = 110;
        if(num1>num2 && num1>num3){
            System.out.println("Biggest number is: " + num1);
        }else if(num2>num1 && num2 > num3){
            System.out.println("Biggest number is: " + num2);
        }else{
            System.out.println("Biggest number is: " + num3);
        }
    }
}
