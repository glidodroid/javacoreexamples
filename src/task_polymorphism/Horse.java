package task_polymorphism;

public class Horse extends Animals {

    /**
     * Example of run time polymorphism. Understood by keyword override.
     */
    @Override
    public void sound() {
        super.sound();
        System.out.println("Neigh");
    }
}
