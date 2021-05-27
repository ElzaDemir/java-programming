package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[]args){
        //CAR INFORMATION

        String carModel = "Toyota";
        String driverName = "Elvira";
        String licenseNumber = "10B5CH";
        short speed = 70;
        boolean Automatic = true;
        char licenseClass = 'D';
        boolean insurance = true;
        String descriptionofacar = "XSE With Sport-Tuned Suspension";

        System.out.println("**** Car Model:\t\t\t\t\t" + carModel + "\t****");
        System.out.println ("---- Driver Name:\t\t\t\t" + driverName+ "\t----");
        System.out.println ("**** License Number:\t\t\t" + licenseNumber+"\t****");
        System.out.println ("---- Speed:\t\t\t\t\t\t" + speed+"\t\t----");
        System.out.println ("**** Transmission Automatic:\t" + Automatic+"\t****");
        System.out.println ("---- License Class:\t\t\t\t" + licenseClass+"\t\t----");
        System.out.println(Automatic+ " - "+speed);


    }


}
