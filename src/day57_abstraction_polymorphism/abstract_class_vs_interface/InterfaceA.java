package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA {
    /**
     * MARKER INTERFACE - interface without any methods or variables. We can use this for polymorphism or to mark the class asa capable of whatever interface claims.
     * Starting java 8 (jdk 1.8)
     * interface can have static adn default methods
     */

    /**
     * ERROR: INTERFACE CANNOT HAVE CONSTRUCTOR
     * public InterfaceA(){} // you cannot have constructor in interface
     */



    public static final String TYPE = "interface";
    double MAX_COUNT = 500; //this is also public static final




    public abstract void absMethodD (int num);

    public static void staticMethodE(String str){
        System.out.println("staticMethodE is called with message with str - " + str);
    }

    public default void defaultMethodF(){
        System.out.println("defaultMethodF is called");
    }

}
