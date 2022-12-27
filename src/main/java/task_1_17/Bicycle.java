package task_1_17;

public class Bicycle extends Cycle {
    public Bicycle() {
        System.out.println("Bicycle class");
    }

    public void balance() {
        System.out.println("balance in Bicycle class");
    }

    public void ride() {
        System.out.println("Bicycle class");
    }

    @Override
    public int ride(int i) {
        return i + 10;
    }
}
