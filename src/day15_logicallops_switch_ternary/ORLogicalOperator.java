package day15_logicallops_switch_ternary;

import java.sql.SQLOutput;

public class ORLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        int apples = 5;
        int avacados = 7;

        System.out.println("Apples & Oranges - " + (apples > 3 || avacados > 4));
        if(apples > 3 || avacados > 4){
            System.out.println("No need to buy any fruits today");
        }else{
            System.out.println("Need to get some fruits");
        }

        System.out.println(apples > 2 || avacados > 10); //TRUE OR FALSE = TRUE


        System.out.println(apples > 2 && avacados > 10); //TRUE AND FALSE = FALSE. because of &&

        if (apples > 2 || avacados > 10){
            System.out.println("Looks like we are good with fruit");
        }else{
            System.out.println("Need to buy some fruit");
        }
        System.out.println(apples == 0 || avacados == 0); //FALSE OR(||) FALSE  = FALSE
    }
}
