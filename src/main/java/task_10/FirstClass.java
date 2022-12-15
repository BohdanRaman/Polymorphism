package task_10;

/**
 * Create a base class with two methods. In the first method, call the
 * second method. Inherit a class and override the second method. Create an object of the
 * derived class, upcast it to the base type, and call the first method. Explain what happens.
 */

public class FirstClass {

    public void numberOneMethod() {
        System.out.println("first method");
        numberTwoMethod();
    }

    public void numberTwoMethod() {
        System.out.println("second method");
    }
}
