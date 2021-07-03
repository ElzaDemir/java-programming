package day58_polymorphism.lets_shopping;

public abstract class OnlineShopping {
    public abstract void buy();
    public abstract void sell();
    public void ship(){
        System.out.println("Shipping the purchased item");
    }
}
