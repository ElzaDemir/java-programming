package day44_custom_classes;

public class AnimalObject {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.type);
        animal.eat("grass");
        animal.eat();
        animal.speak();

        //New Animal object = cheetahObj
        Animal cheetahObj = new Animal();
        cheetahObj.eat();
        cheetahObj.speak();
        cheetahObj.eat("meat");
        cheetahObj.type = "cheetah";
        System.out.println(cheetahObj.type);

    }
}
