package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {
    public static void main(String[] args) {
        Animal a1 = new Animal();//not polymorphic, because data type and object type are the same.
        a1.makeNoise();

        //Polymorphism = polymorphic way
        //parent type = new child type
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal cat = new Horse();

        animal1.makeNoise();
        animal2.makeNoise();
        cat.makeNoise();

        //Polymorphic list of objects. LIst data type is Parent Class.
        //Objects are any of the child classes
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());
        for (Animal each : listOfAnimals){
            each.makeNoise();
        }


        //List list = new ArrayList(); -> it is also polymorphic way

    }
}
