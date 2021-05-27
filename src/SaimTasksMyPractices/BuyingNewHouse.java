package SaimTasksMyPractices;

public class BuyingNewHouse {
    public static void main(String[] args) {
        String neighborhood = "Ladue";
        double houseprice;
        int schoolrating;
        boolean allowpets;

        switch (neighborhood){
            case "Whisper Hollow":
                houseprice = 300_000.000;
                schoolrating = 9;
                allowpets = false;
                System.out.println("Neighborhood Name: " + neighborhood + "\nHouse Price: $" + houseprice + "\nSchool Rating: " + schoolrating +
                        "\nAre pets allowed? - " +allowpets);
                break;
            case "St Peters":
                houseprice = 250_000.000;
                schoolrating = 7;
                allowpets = true;
                System.out.println("Neighborhood Name: " + neighborhood + "\nHouse Price: $" + houseprice + "\nSchool Rating: " + schoolrating +
                        "\nAre pets allowed? - " +allowpets);
                break;

            case "Ladue":
                houseprice = 400_000.000;
                schoolrating = 8;
                allowpets = true;
                System.out.println("Neighborhood Name: " + neighborhood + "\nHouse Price: $" + houseprice + "\nSchool Rating: " + schoolrating +
                        "\nAre pets allowed? - " +allowpets);
        }
    }
}
