package task_inheritance;

/**
 * Process by which one class acquires the properties of another class.
 * Aim of inheritance is code reusability ie. subclass inherits variable and methods of super class.
 * Java doesn't support multiple inheritance ie. a subclass can extend only one class.
 *
 */
public class Animal {

    private int noOfLegs;
    private String eat;
    private boolean vegetarian;

    public Animal(){

    }

    public Animal(int noOfLegs, String eat, boolean vegetarian) {
        this.noOfLegs = noOfLegs;
        this.eat = eat;
        this.vegetarian = vegetarian;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "noOfLegs=" + noOfLegs +
                ", eat=" + eat +
                ", vegetarian=" + vegetarian +
                '}';
    }
}
