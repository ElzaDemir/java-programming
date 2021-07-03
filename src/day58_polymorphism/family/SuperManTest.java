package day58_polymorphism.family;

public class SuperManTest {
    public static void main(String[] args) {
       Worker worker = new Superman();
       worker.work("SDET");
       System.out.println("superman get paid $" + worker.getPaid());

       Shopper shopper =new Superman();
       shopper.carryBags();
       shopper.purchase("Vegetables");

       Husband husband = new Superman();
       husband.marry("Lovely wife");
       husband.takeCare();

       Father father = new Superman();
       father.raiseKid();
       father.feeKidd();
       father.playWithKidd();
       //father.work("SDET"); //ERROR" father is from Father class and  can only access methods in father

        Superman superman = new Superman();
        superman.marry("wife");
        superman.getPaid();
        superman.raiseKid();
        superman.takeCare();
        superman.feeKidd();
        superman.playWithKidd();

    }
}
