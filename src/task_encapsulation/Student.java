package task_encapsulation;

/**
 * Wrapping data(variables) and together in single unit.
 * Prevents other objects from directly altering or accessing the properties or methods of encapsulated class.
 * Does not take arguments from a constructor.
 * Fully encapsulated class make its all data members private.
 */
public class Student {


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", standard=" + standard +
                '}';
    }

    private int id = 1;
    private String name;
    private int standard;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        // encapsulation id variable by allowing to set its value above zero
        if (id > 0) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }
}
