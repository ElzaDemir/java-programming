package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {
        /**
         * AbstractA absA = new AbstractA() {  --> We cannot create object (instantiate) neither of them
         * InterfaceA iA = new InterfaceA() {}} --> We cannot create object (instantiate) neither of them
         */
        InterfaceA.staticMethodE("wooden spoon");
        //ConcreteA.staticMethodE("hello"); -> staticMethodE only works with interface.staticMethodE
        ConcreteA.staticMethodC();

    }
}
