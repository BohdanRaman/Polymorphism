package task_9_12_14;


public class Gerbil extends Mouse {
    private static long counter = 0;
    private final long id = counter++;

    public String toString1() {
        return "Gerbil refCount: " + id;
    }

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
        return super.jump(cm);
    }

    @Override
    public String eat(int gram) {
        return super.eat(gram);
    }

    @Override
    public String toString() {
        return "Gerbil: " + "\n" + " jump cm: " + jump(2)
                + ", eat: " + eat(2) + ", say: " + say("po p po");
    }
}
