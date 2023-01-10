package task_1_17;

public class Tricycle extends Cycle {
    public Tricycle() {
        System.out.println("Tricycle class");
    }

    public void ride() {
        System.out.println("Tricycle class, method ride()");
    }

    @Override
    public int ride(int i) {
        return i + 10;
    }
}
