package day15_logicallops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 20;
        if(!(age>7)){
            System.out.println("Need to sit in car seat " + age);
        }else{
            System.out.println("Can seat in passenget sit. age = " + age);
        }

        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed){
            System.out.println("Smoking is not allowed here. Exit");
        }
        boolean isAffordable = true;
        if(!isAffordable){
            System.out.println("Item not affordable");
        }
        String carmodel="tesla";
        if (!carmodel.equals("Tesla")){
            System.out.println("Nor interested - " + carmodel);
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if(!inputPassword.equals ("secretPassword")){
            System.out.println("Incorrect Password");
        }


    }
}
