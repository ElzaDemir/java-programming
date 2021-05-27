package day32_arrays_split;

import java.sql.SQLOutput;

public class MallShopping {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println("------- FIND THE INDEX OF 'Gloves' in items array -------");

        for(int i = 0; i<items.length;i++){
            if (items[i].equals("Gloves")) {

                System.out.println("Index of Gloves is " + i);
                break;// exit for loop
            }
        }
        System.out.println("----- Set boolean to true if first 'iPad' is found -----");
        boolean iPadExists = false;
        for (int j  = 0; j<items.length; j++){ //or you can do for(String item: items){
            if(items[j].equals("iPad")){

                iPadExists = true;
                break;
            }
        }
        System.out.println("iPad Exists " + iPadExists);

        System.out.println("iPadExists = " + iPadExists);
        if (iPadExists){
            System.out.println("We bought an iPad");
        }else{
            System.out.println("We forgot to buy iPad");
        }

        System.out.println("-----Print a report of each shopping item-----");
        for (int s = 0; s<items.length;s++){
            System.out.println(items[s] + ":  $" + prices[s] +" -#" + itemIDs[s]);
        }

        System.out.println(("-----Look for jacket and print all detailes-----"));
        for(int a = 0; a < items.length; a++){
            if(items[a].equals("Jacket")){
                System.out.println(items[a] + " - $"  + prices[a]+ " Item number is:#" + itemIDs[a]);

            }

        }

    }

}
