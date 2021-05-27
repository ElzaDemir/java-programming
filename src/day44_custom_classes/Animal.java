package day44_custom_classes;

public class Animal {
    String type = "wolf";

    public void  eat () {

    }

    public void eat (String food) {
        System.out.println(type + " eating " + food);

    }
    public void speak () {
        System.out.println(type + "speaking");
    }

}
