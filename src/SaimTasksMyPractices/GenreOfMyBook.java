package SaimTasksMyPractices;

public class GenreOfMyBook {
    public static void main(String[] args) {
        String genre = "Fiction";
        int averagePage;
        double averageProfit;
        int numberOfSequals;
        int numberOfCountries;

        switch (genre){
            case "Fiction":
                averagePage = 200;
                averageProfit = 150000;
                numberOfSequals = 3;
                numberOfCountries = 50;
                System.out.println("The genre of my book is " + genre + ". It will be " + averagePage + " pages. The average profit will be $" + averageProfit + ". \nNumber of Sequals : " + numberOfSequals +
                        ". \nIt'll be published in " + numberOfCountries + " countries.");
                break;

            case "Non-Fiction":
                averagePage = 250;
                averageProfit = 200000;
                numberOfSequals = 5;
                numberOfCountries = 45;
                System.out.println("The genre of my book is " + genre + ". It will be " + averagePage + " pages. The average profit will be $" + averageProfit + ". \nNumber of Sequals : " + numberOfSequals +
                        ". \nIt'll be published in " + numberOfCountries + " countries.");
                break;

            case "Detective":
                averagePage = 400;
                averageProfit = 250000;
                numberOfSequals = 6;
                numberOfCountries = 60;
                System.out.println("The genre of my book is " + genre + ". It will be " + averagePage + " pages. The average profit will be $" + averageProfit + ". \nNumber of Sequals: " + numberOfSequals +
                            ". \nIt'll be published in " + numberOfCountries + " countries.");

        }
    }
}
