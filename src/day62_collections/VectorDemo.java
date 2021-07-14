package day62_collections;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        List<String> states = new Vector<>();
        states.add("MO");
        states.add("MA");
        states.add("CA");
        states.add("PA");
        states.add("TX");
        states.add("CO");
        states.add("MO");

        System.out.println(states);

        //VECTOR is synchronized
    }
}
