package day55_abstraction.exercise_example;

public abstract class Exercise {
    public void start(){ //non-abstract method
        System.out.println("Warming up and starting the exercise");

    }
    /**
     * abstract method- method without body/implementation, just signature
     * purpose:letting sub classes implement/override their own way
     */
    public abstract void perform();

    /**
     * another abstract - method that concrete sub classes wil override/implement
     * @oaram minutes - jow long is exercise is performed
     * @return number of calories burned
     */

    public abstract int getCaloriesCount (int minutes);
}
