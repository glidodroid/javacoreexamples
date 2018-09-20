package task_interface;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println(label);
        System.out.println("Drawing rectangle");
    }
}
