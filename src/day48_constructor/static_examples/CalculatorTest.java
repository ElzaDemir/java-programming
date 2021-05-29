package day48_constructor.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        //add is static method , can be called using Classname.staticMethodName
        //static way of calling the method
        Calculator.add(5, 3);

        //Calculator.multiply(2, 4)---> ERROR: multiply is not static. Need object to call it
        //multiply is instance method, and we are creating object then calling it
        Calculator calObject = new Calculator();
        calObject.multiply(2, 4);
        //static method can also be called using an Object
        calObject.add(10, 45);

        System.out.println("Hello World"); //just for the git practice
    }
}
