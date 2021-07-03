package day58_polymorphism.family;

public class Superman extends Father implements Worker, Shopper, Husband{

    @Override
    public void work(String job) {
        System.out.println("Superman is working as " + job);

    }

    @Override
    public double getPaid() {
        System.out.println("Superman is getting paid");
        return 8000;
    }

    @Override
    public void purchase(String item) {
        System.out.println("Father goes for shopping and buys product");
    }

    @Override
    public void carryBags() {
        System.out.println("Father carries bags after shopping");

    }

    @Override
    public void marry(String wife) {
        System.out.println("Father loves his wife");

    }

    @Override
    public void takeCare() {
        System.out.println("Father takes care of family");

    }

    public void playWithKid(){
        System.out.println("Father plays with kid");
    }
}
