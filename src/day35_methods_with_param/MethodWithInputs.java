package day35_methods_with_param;

public class MethodWithInputs {
    public static void main(String[] args) {
        displayValue(6);
        displayValue(94);
        int count = 55;
        displayValue(count);
        //String name = "Elvira";
        greetByname("Elvira");
        greetByname("Nadir");
    }
    public static void displayValue(int num){
        System.out.println("value is " + num);
    }
    public static void greetByname(String name){
        System.out.println("Hello " + name + ", how are you today?");

    }

}
