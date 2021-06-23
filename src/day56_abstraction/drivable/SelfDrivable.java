package day56_abstraction.drivable;

public interface SelfDrivable {
    public void autoPiloting();
    //void selfPark(); this causes error in sub classes, because they must override
    public default void selfPark(){
        System.out.println("performing self park steps"); //if we add default method it will prevent

    }
}
