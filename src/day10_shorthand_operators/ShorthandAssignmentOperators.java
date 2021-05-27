package day10_shorthand_operators;

public class ShorthandAssignmentOperators {
    public static void main(String[] args) {
        int n = 5;
        n +=3;
        System.out.println("n = " + n);

        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars);
        cars += 5;
        System.out.println("cars in parking lot = " + cars);
        cars -=6;
        System.out.println("cars in parking lot = " + cars);
        //cars = cars - 1;
        cars  -=1;
        System.out.println("cars in parking lot = " + cars);
        
        int electricCars = 13;
        cars +=electricCars;
        System.out.println("cars = " + cars);

        String word = "Java";
        System.out.println("word = " + word);
        word = word + " programming";
        System.out.println("word = " + word);
        //add "is fun"
        
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but \"selenium\" is more fun";
        word += selenium;
        System.out.println("word = " + word);

        word += 12345;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("Letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
       // letter = 'J';
        letter += 6;
        System.out.println("letter = " + letter);

        double parkingfee = 7.50;
        System.out.println("normal parking fee = " + parkingfee);
        parkingfee /= 2;
        System.out.println("early bird parking fee = " + parkingfee);
        parkingfee -=parkingfee;
        System.out.println("early bird parking fee = " + parkingfee);


        


    }
}
