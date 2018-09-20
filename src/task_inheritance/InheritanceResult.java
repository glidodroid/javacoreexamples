package task_inheritance;

/**
 * Definition in {@link task_inheritance.Animal}
 */
public class InheritanceResult {

    public static void main(String[] args) {
     Cat cat = new Cat(4,"milk",true,"black");
     System.out.println(cat.toString());
     System.out.println(cat.getNoOfLegs());
     System.out.println(cat.getEat());
     System.out.println(cat.isVegetarian());
     InheritanceResult inheritanceResult = new InheritanceResult();
     inheritanceResult.downCasting();
     inheritanceResult.upCasting();
    }

    private void upCasting() {
        Cat cat = new Cat(4,"fish",false,"white");
        Animal animal = cat;
        System.out.println(cat.toString());
        System.out.println(animal.toString());
    }

    private void downCasting() {
        Cat cat = new Cat(4,"rice",true,"brown");
        Animal animal = cat;
        Cat anotherCat = (Cat) animal; // explicit casting
        System.out.println(cat.toString());
        System.out.println(animal.toString());
        System.out.println(anotherCat.toString());
    }
}
