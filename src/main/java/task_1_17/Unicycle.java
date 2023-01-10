package task_1_17;

public class Unicycle extends Cycle {
    public Unicycle() {
        System.out.println("Unicycle class");
    }

    public void balance(){
        System.out.println("balance in Unicycle class");
    }

    public void ride() {
        System.out.println("Unicycle class, method ride()");
    }

    @Override
    public int ride(int i) {
        return i + 10;
    }
}
