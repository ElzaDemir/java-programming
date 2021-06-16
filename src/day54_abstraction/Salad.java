package day54_abstraction;

public class Salad extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("chop veggies and add dressing");
    }

    @Override
    public void serve() {
        System.out.println("put forks on the table");

    }
}
