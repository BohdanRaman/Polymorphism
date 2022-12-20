package task_9_12_14;



public class Gerbil extends Mouse {
    private Mouse mouse;
    private static long counter = 0;
    private final long id = counter++;

    public Gerbil(Mouse mouse) {
        System.out.println(("Creating "));
        this.mouse = mouse;
        this.mouse.addRef();
    }
    public String toString1() { return "Gerbil " + id; }
    public Gerbil(int age, String name) {
        super(age, name);
    }

    public Gerbil() {
        System.out.println("class Gerbil is initialization third");
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
        return "Gerbil: " + "\n" + " jump cm: " + jump(2)
                + ", eat: " + eat(2) + ", say: " + say("po p po");
    }
}
