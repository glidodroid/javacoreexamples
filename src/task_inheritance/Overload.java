package task_inheritance;

/**
 * Example of compile time polymorphism.
 * Here method demo is overloaded three times.
 */
public class Overload {

    public void demo(int a) {
        System.out.println(a);
    }

    public void demo(int a, int b) {
        System.out.println(a+b);

    }

    public void demo(int a,int b, int c) {
        System.out.println(a+b+c);

    }
}
