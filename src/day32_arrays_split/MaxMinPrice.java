package day32_arrays_split;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        double max = prices[0];
        double min =prices[0];
        int indexOfMax = 0;
        int indexOfMin = 0;

        for(int i = 0; i<items.length;i++){
            if(prices[i] > max){
                max=prices[i];
                indexOfMax= i;
            }
        if(prices[i]< min){
            min = prices[i];
            indexOfMin= 1;
        }

        }
        System.out.println("The expensive item is: " + max + "\nIndex of item is: " + indexOfMax);
        System.out.println("The most cheapest item is: " + min + "\nIndex of cheapest item: " + indexOfMin);


    }
}
