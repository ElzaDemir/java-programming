package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 2568;
        System.out.println("balance = $" + balance);

        double baklava = 22.50;
        System.out.println("baklava = $" + baklava);
        balance = balance-baklava;
        System.out.println("Balance after I bought baklava = $" + balance);

        //double balance1 = 100.0;
        //double price1 = 10.0;
        //double remainingBalance = balance1 - price1;
         //Now we are just changing the variable value itself without adding new one.

        double kunefe = 44.45;
        System.out.println("kenafa = " + kunefe);
        balance = balance-kunefe;
        System.out.println("Balance after kunefe = " + balance);
        kunefe = kunefe / 2; //50% off
        System.out.println("Balance after sale = " + kunefe);
        balance = balance - kunefe;
        System.out.println("Balance after second kunefe = " + balance);
        
        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance-plov;
        System.out.println("balance = " + balance);
        
        double Tea = 3.00;
        System.out.println("Tea = " + Tea);
        balance = balance - Tea * 4;
        System.out.println("balance after 4 teas = $" + balance);

        balance = balance + baklava;
        System.out.println("balance after returning baklava= " + balance);
        







        }
    }

