package task_static;

/**
 * Definition in {@link task_static.Student}
 */
public class ResultStatic {

    private static int passPercentage = 100;

    // this block initialize the static variables and executed before the main method.
    static {
        System.out.println("This run before main method.. awesome !!!");
        System.out.println(passPercentage);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setRollNumber(234);
        student.setName("naveen");
        System.out.println(Student.getCollege());
        Student.changeCollegeName("Harvard");
        System.out.println(Student.getCollege());
        System.out.println(ResultStatic.passPercentage);
        Student.Infants infants = new Student.Infants();
        infants.displayName();

    }
}
