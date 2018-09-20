package task_inheritance;

public class Cat extends Animal {

    private String color;

    public Cat(int noOfLegs, String eat, boolean vegetarian, String color) {
        super(noOfLegs, eat, vegetarian);
        this.color = "White";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                '}';
    }
}
