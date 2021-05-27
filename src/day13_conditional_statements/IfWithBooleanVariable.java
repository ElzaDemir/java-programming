package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry= false;

        if (isHungry){
            System.out.println("I am hungry I will go get something to eat");
            System.out.println("Then code Java");
        }else{
            System.out.println("I am not hungry, let's keep coding java");
        }
        double price = 130.44;
        boolean isAffordable = 200 >= price;
        System.out.println("isAffordable? - " + isAffordable);
        if (isAffordable){
            System.out.println("Yes, you can afford to buy one more item");
        }else{
            System.out.println("No, your balance is not enough to buy one more item");
        }
        //isRemoteJob
        boolean isRemoteJob = false;
        if (isRemoteJob != true){
        //if (!isRemoteJob){
            System.out.println("Sorry,I am not interested");
        }else{
            System.out.println("Sure, I am interested. what is the process for interview");
        }

    }
}
