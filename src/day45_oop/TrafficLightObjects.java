package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red"; NOT THIS WAY today
        //we will assign/update the value color using a method of the class
        trafficLight.changeColor("red");
       // System.out.println(trafficLight.color); DIRECT access to variable . Not recommended
        //call method to access variable:
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight1 = new TrafficLight();
        trafficLight1.changeColor("blue");
        trafficLight1.showColor();

    }
}
