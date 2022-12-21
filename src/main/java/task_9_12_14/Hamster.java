package task_9_12_14;

public class Hamster extends Gerbil {
    Rodent rodent = new Rodent();
    Mouse mouse = new Mouse();
    Gerbil gerbil = new Gerbil();
    public Hamster(int age, String name) {
        super(age, name);
    }

    public Hamster() {
        System.out.println("class Hamster is initialization fourth");
    }

    private Gerbil gerbil1;
    private static long counter = 0;
    private final long id = counter++;

    public Hamster(Gerbil gerbil1) {
        System.out.println(("Creating hamster" + this));
        this.gerbil1 = gerbil1;
        this.gerbil1.addRef();
    }

    public String toString1() { return "Hamster refcount: " + id; }

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
        return "Hamster: " + "\n" + " jump cm: " + jump(3)
                + ", eat: " + eat(3) + ", say: " + say("yui yiu");
    }
}
