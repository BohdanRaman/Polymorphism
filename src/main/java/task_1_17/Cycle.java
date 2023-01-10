package task_1_17;

/**
 * Exercise 1: Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 * Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
 * <p>
 * Exercise 5: Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of wheels.
 * Modify ride( ) to call wheels( ) and verify that polymorphism works
 * <p>
 * Exercise 17: (2) Using the Cycle hierarchy from Exercise 1, add a balance( ) method to
 * Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast
 * them to an array of Cycle. Try to call balance( ) on each element of the array and observe
 * the results. Downcast and call balance( ) and observe what happens.
 */
public class Cycle {
    private int countWheels;

    public void ride() {
        System.out.println("Basic class Cycle");
    }

    public int ride(int i) {
        return wheels();
    }

    private int wheels() {
        System.out.println("count of wheels: " + countWheels);
        return countWheels;
    }
}
