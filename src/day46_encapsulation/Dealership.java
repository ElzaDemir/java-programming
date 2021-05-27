package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
        //ERROR BELOW, model and year are PRIVATE and
//        car1.model = "Nissan Altima";
//        car1.year = 2020;
       // car1.mileage = 27_500;

        car1.setModel("Nissan Qashqai");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMileage(27500_32);
        System.out.println("car1 mileage = " + car1.getMileage());

        System.out.println(car1.toString());
        System.out.println(car1);// automatically calls toString method

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo Giulia  Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(12_000);

        System.out.println(" Model = " + alfaRomeo.getModel());
        System.out.println("Year = " + alfaRomeo.getModel());
        System.out.println("Mileage = " + alfaRomeo.getMileage());
        System.out.println(alfaRomeo);
        System.out.println(alfaRomeo.toString()); //this is also way to call toString mmethod
    }

}
