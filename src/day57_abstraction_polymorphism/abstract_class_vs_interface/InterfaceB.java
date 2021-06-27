package day57_abstraction_polymorphism.abstract_class_vs_interface;

import java.io.Serializable;

/**
 * Interface can extend multiple Other interfaces. Interfaces support Multi-Inheritance
 * When it extend another interface child interface is not responsible to override any methods
 * Concrete sub class will be responsible for overriding all abstract methods
 */
public interface InterfaceB extends InterfaceA, Serializable, Cloneable{ }

