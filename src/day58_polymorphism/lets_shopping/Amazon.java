package day58_polymorphism.lets_shopping;

public class Amazon extends OnlineShopping implements Prime{


    @Override
    public void buy() {
        System.out.println("I am purchasing items on amazon.com");
    }

    @Override
    public void sell() {
        System.out.println("But I am not selling items in amazon.com");

    }

    @Override
    public void primeShipping() {
        System.out.println("I am a prime member in amazon.com and I have free shipping");
    }
}
