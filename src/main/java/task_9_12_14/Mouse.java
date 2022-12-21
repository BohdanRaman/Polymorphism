package task_9_12_14;

public class Mouse extends Rodent {
    private Rodent rodent;
    private static long counter = 0;
    private final long id = counter++;

    public String toString1() {
        return "Mouse refCount: " + id;
    }

    public Mouse(Rodent rodent) {
        System.out.println(this);
        this.rodent = rodent;
        this.rodent.addRef();
    }

    public Mouse(int age, String name) {
        super(age, name);
    }

    public Mouse() {
        System.out.println("class Mouse is initialization second");
    }

    @Override
    public String say(String voice) {
        return voice;
    }

    @Override
    public int jump(int cm) {
        return cm;
    }

    @Override
    public int eat(int gram) {
        return gram;
    }

    @Override
    public String toString() {
        return "Mouse: " + "\n" + " jump cm: " + jump(1)
                + ", eat: " + eat(1) + ", say: " + say("mi mi mi");
    }
}
