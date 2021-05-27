package day07_arithmetic_operators_casting;

public class WarmUpClass {
    public static void main (String[]args){
        String city1 = "Chicago";
        String city2 = "Atlanta";
        int ticketPrice = 217;
        double mileage   = 606;
        short hours = 1;
        long minutes = 38L;


        System.out.println ("I am travelling from " + city1 + " to " + city2 + " and the price for the ticket is $" + ticketPrice +
                ". Miles between these two cities are " + mileage+ ". Estimated flight time is " + hours + " hour and " + minutes + " minutes.");


        String sentence = "I am travelling from " + city1 + " to " + city2 + " and the price for the ticket is $" + ticketPrice +
                ". Miles between these two cities are " + mileage+ ". Estimated flight time is " + hours + " hour and " + minutes + " minutes.";
        System.out.println (sentence);


    }

}
