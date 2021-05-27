package SaimTasksMyPractices;

import java.sql.SQLOutput;

public class House {
    public static void main(String[] args) {
        String housetype = "Condo";
        short numberofbedrooms = 3, numberofbathrooms = 2, numberofkitchens = 1;
        boolean isthereabasement = true, isthereanattic = false, isthereapool = false, isthehouseforsale = true;
        double costofthehouse = 249.999;
        int number = 12235;
        String address = "Whisperringhills";
        long zipcode = 63254;
        boolean isthereparknearby = true;
        byte ratingofschools = 5;

        System.out.println("The house type that we are selling is " + housetype + ". There are " + numberofbathrooms
        + " bedrooms, " + numberofbathrooms +" bathrooms " + " and " + numberofkitchens + " kitchen.");
        System.out.println("Is there a basement? - " + isthereabasement + "\nIs there an atic? - " + isthereanattic + "\nIs there a pool? - " + isthereapool +
                "\nIs the house for sale? - " + isthehouseforsale);
        System.out.println("The cost of the house - $" + costofthehouse);
        System.out.println("Address of the house is " + number + " " + address + ", " + zipcode);
        System.out.println("Is there park nearby? - " + isthereparknearby);
        System.out.println("The best schools nearby is rated " + ratingofschools);






    }
}
