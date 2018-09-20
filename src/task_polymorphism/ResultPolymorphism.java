package task_polymorphism;

import task_inheritance.Overload;

/**
 * Definition in {@link task_polymorphism.Animals}
 */
public class ResultPolymorphism {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.sound();
        Overload overload = new Overload();
        overload.demo(1);
        overload.demo(1,2);
        overload.demo(1,2,3);
    }

}
