package day59_polymorphism_exceptions;

import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.shapes.Square;

public class InstanceOf {
    public static void main(String[] args) {
        //"instanceof" operator
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);
        if (shape instanceof Circle){
            System.out.println("It is a circle object");
        }else if (shape instanceof Square){
            System.out.println("It is a square object");
        }
        System.out.println(shape.getClass().getSimpleName()); //just class name of object
        System.out.println(shape.getClass().getName()); // class name and package name
        if (shape.getClass().getSimpleName().equals("Square")){
            System.out.println("It is square object");
        }
        System.out.println(shape.getClass().getDeclaredMethods().length);

        WebElement el = new Link();
        System.out.println("object class name of el variable = " + el.getClass().getSimpleName());
    }
}
