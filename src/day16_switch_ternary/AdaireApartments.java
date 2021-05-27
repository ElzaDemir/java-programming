package day16_switch_ternary;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class AdaireApartments {
    public static void main(String[] args) {
        System.out.println("\n*** WELCOME TO ADAIRE APARTMENTS ***");
        System.out.println(" ");
        int numberofbedrooms = 1;
        double startingPrice = 0.0;

        switch(numberofbedrooms){
            case 1:
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                break;
            case 2:
                System.out.println("Two bedrooms apartment selected");
                startingPrice = 2899;
                break;
            case 3:
                    System.out.println("Three bedrooms apartment selected");
                    startingPrice = 3050;
                    break;
            default:
                System.out.println("5 bedroom apartments currently unavailable");
        }
        System.out.println("********************************** ");
        System.out.println("Starting price $" + startingPrice);


    }
}
