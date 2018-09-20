package task_interface;

/**
 * Interface is provided to achieve full abstraction.
 * Its specifies what class should do and but not how it should do.
 * Contains only abstract methods and static constant variables.
 * Supports multiple inheritance.
 */
public interface Shape {
    // implicitly public, static amd final
    String label = "shape";

    // implicitly public and abstract.
    void draw();
}
