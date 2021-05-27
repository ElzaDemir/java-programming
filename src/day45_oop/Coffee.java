package day45_oop;

public class Coffee {
    String type;
    int amount;

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }

    public void refill() {
        amount = 100;

    }

    public void drink (int someAmount) {
        amount -= someAmount;
    }
    public int getAmount() {
        return amount;

    }

    public void setType(String newType){
        type = newType;
    }

    public String getType(){
        return type;
    }
}

