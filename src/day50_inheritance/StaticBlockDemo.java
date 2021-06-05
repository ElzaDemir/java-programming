package day50_inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticBlockDemo {

    public static class Inner{

    }
    static int num;
    static List<String> carModels;
    static {
        System.out.println("static initializer block");
        num=10;
        carModels = new ArrayList<>();
        carModels.addAll(Arrays.asList("Abarth", "Volvo", "Toyota", "Aston Martin", "Alfa Romeo"));
    }

    { //initializer block -> runs each time object created, before constructor
        System.out.println("Initializer block");
    }
    public StaticBlockDemo(){
        System.out.println("Constructor Method");
        num+=5;
    }
    public StaticBlockDemo(int value){
        System.out.println("Overloaded constructor - value = " + value);
    }
}
