package day56_abstraction.drivable;

import javafx.animation.TranslateTransition;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla tesla1 = new Tesla();
        tesla1.start();
        tesla1.hi();
        tesla1.transportPeople();
        tesla1.autoPiloting();
        tesla1.cost(25);
        tesla1.stop();
        tesla1.bye();

        System.out.println(" ");

        Plane plane1 = new Plane();
        plane1.start();
        plane1.hi();
        plane1.transportPeople();
        plane1.autoPiloting();
        plane1.cost(50);
        plane1.land();
        plane1.stop();
        plane1.bye();

        SelfDrivable sd1 = new Plane();
        SelfDrivable sd2 = new Tesla();

        Transportation tp1 = new Plane();
        Transportation tp2 = new Tesla();



    }
}
