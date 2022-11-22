package cycle_class_task1;

/**
 * Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 * Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
 * <p>
 * Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of wheels.
 * Modify ride( ) to call wheels( ) and verify that polymorphism works
 */
public class Cycle {

    public void ride() {
        System.out.println("Basic class Cycle");
    }

    public int ride(int i ){
        return wheels(i);
    }

    public int wheels(int c){
        System.out.println("count of wheels: ");
        return c;
    }
}
