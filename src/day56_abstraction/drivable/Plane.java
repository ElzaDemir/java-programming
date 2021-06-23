package day56_abstraction.drivable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void autoPiloting() {
        System.out.println("Flying on Auto-pilot mode");
    }

    @Override
    public void transportPeople() {
        System.out.println("Plane is transporting people from one city to another");

    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane costs " + (mile * 0.10) + " to drive " + mile + " miles.");

    }

    @Override
    public void hi() {
        System.out.println("Welcome to the board");
    }

    @Override
    public void bye() {
        System.out.println("See you in another flight. Bye!");

    }

    public void land() {
        System.out.println("Plane is landing");
    }
}
