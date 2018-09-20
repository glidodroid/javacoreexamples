package task_encapsulation;

/**
 * Definition in class {@link task_encapsulation.Student}
 */
public class EncapsulationResult {

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(0);
        student.setName("jordan");
        student.setStandard(12);
        System.out.println(student.toString());
    }
}
