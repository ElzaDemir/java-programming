package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main (String [] args){
        double balance = 345.55;
        double price1 = 20.88, price2 = 89.99;
        int price3 = 15;
        //double remainingbalance = balance - (price1 + price2 + price3);
        double remainingbalance = balance - price1 - price2 - price3;
        balance = remainingbalance;

        int balanceWithNoCents = (int)remainingbalance;

        System.out.println ("Your remaining balance without cents is " + balanceWithNoCents);


        System.out.println("Your initial balance : $ " + balance);
        System.out.println("Your remaining balance : $ " + balanceWithNoCents);



    }
}
