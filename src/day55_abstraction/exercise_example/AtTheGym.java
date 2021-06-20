package day55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {
        /**
         * //Below code (object) - Another benefit of abstraction that we can have one variable of type abstract class ans object can be any subclass. It is called POLYMORPHISM that we will learn later
         */
        Exercise exercise = new Running();
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 min. - calories = " + exercise.getCaloriesCount(30));

        running.start();
        running.perform();
        System.out.println("Running 30 min. - calories = " + running.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("Swimming 30 min. - calories = " + swimming.getCaloriesCount(30));

        freeWeight.start();
        freeWeight.perform();
        System.out.println("Free Weight 30 min. - calories = " + freeWeight.getCaloriesCount(30));
    }
}
