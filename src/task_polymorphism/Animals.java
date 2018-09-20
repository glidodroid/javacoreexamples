package task_polymorphism;

/**
 * Capability of method to do different things based on the object that it acting upon.
 * In Other words: One interface , multiple implementation.
 * Polymorphism is divided into static or compile time polymorphism and dynamic or run time polymorphism.
 * Static polymorphism achieved by method overload and dynamic is achieved by method override.
 * Java implement polymorphism through method override, overload and inheritance.
 */
public class Animals {
    public void sound() {
        System.out.println("Animals make sound");
    }
}
