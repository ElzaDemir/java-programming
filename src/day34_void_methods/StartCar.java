package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        sitInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
    }
    public static void sitInCar(){
        System.out.println("First sit in car");
    }

    public static void startTheCar(){
        System.out.println("Now start the car");
    }
    public static void shiftToDrive(){
        System.out.println("Press brake pedal and shift to 'D'");
    }
    public static void pressGasPedal(){
        System.out.println("Now press the gas pedal and start driving. Be careful.");
    }

}
