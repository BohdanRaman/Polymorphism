package task_9_12_14;

public class Hamster extends Gerbil {

    public Hamster(int age, String name) {
        super(age, name);
    }

    public Hamster() {
        System.out.println("class Hamster is initialization fourth");
    }

    private static long counter = 0;
    private final long id = counter++;

    public String toString1() {
        return "Hamster refCount: " + id;
    }

    @Override
    public String say(String voice) {
        return voice;
    }

    @Override
    public int jump(int cm) {
        return super.jump(cm);
    }

    @Override
    public String eat(int gram) {
        return super.eat(gram);
    }

    @Override
    public String toString() {
        return "Hamster: " + "\n" + " jump cm: " + jump(3)
                + ", eat: " + eat(16) + ", say: " + say("yui yiu");
    }
}
