package task_abstraction;

/**
 * Definition in {@link task_abstraction.Employee}
 */
public class AbstractionResult {

    public static void main(String[] args) {
        Employee fullTimeEmp = new FullTimeEmployee("jack", 300);
        Employee contractor = new Contractor("arun", 400, 5);
        System.out.println(fullTimeEmp.getName() + " " + fullTimeEmp.calculateSalary());
        System.out.println(contractor.getName() + " " + contractor.calculateSalary());
    }
}
