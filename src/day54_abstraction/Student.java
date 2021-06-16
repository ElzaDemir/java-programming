package day54_abstraction;

/**
 * --> we add abstract keyword toa class to make it an abstract class
 * --> We cannot create object of Student class - meaning:
 * student student = new Student(); will show ERROR
 * --> what can we do with this Student class? We can extend this class by sub classes
 * -->Student class will Parent class for all other types of student related classes
 */

public abstract class Student {
    public void code (String language){
        System.out.println("Student writes code using "  + language);
    }

    /**
     * we can add abstract class into asbtract class.
     * abstract method - is created using abstract keyword
     * and does not have the implementation/method body
     *
     * So abstract only shows WHAT it can do, but nor HOW by using abstract methods
     */

    public abstract void attendClass();

}
