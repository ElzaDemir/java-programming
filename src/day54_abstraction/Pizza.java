package day54_abstraction;

public class Pizza extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("Stretch the dough and put veggies on top");
    }

    @Override
    public void serve() {
        System.out.println("serve pizza to the guests");

    }
}
