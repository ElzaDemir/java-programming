package day50_inheritance;

public class Cat extends Animal {

    public void jump(){
        System.out.println("Cat is jumping");

    }
    @Override  //this is optional, ypu can put it or not
    public void speak (){
        System.out.println("Cat is saying meow...");

    }
}
