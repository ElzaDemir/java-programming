package day46_encapsulation;

public class Car {
    //encapsulated/hidden instance variables
    private String model;
    private int year;
    private double mileage;

    //setter method for model
    public void setModel(String carModel){
        model = carModel;
    }
    //getter method for model
    public String getModel(){
        return model;
    }
    //setter for year
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public void setMileage(double mileage){
        this.mileage=mileage;
    }

    public double getMileage(){
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
