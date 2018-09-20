package task_static;

/**
 * Static variables get memory only one in class area at the time when class loads.
 * Static variable value can be accessed and changed only by the static method of that class.
 * Static method can be invoked without creating the instance of that class.
 * 'this', 'super' keywords cannot be used inside the static method.
 * Static class can be declared only as nested class.
 * Static class cannot access non-static members.
 */
public class Student {

    private int rollNumber;
    private String name;
    static String college = "MIT";

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    static void changeCollegeName(String newCollegeName) {
        college = newCollegeName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }

    static class Infants {

        void displayName() {
            changeCollegeName("Oxford");
            System.out.println(college);
        }
    }
}
