package task_9_12_14;

public class Hamster extends Gerbil {
    private static long counter = 0;
    private final long id = counter++;
    private int hamsterJump = 3;
    private int hamsterEat = 16;
    private String hamsterSay = "yui yiu";

    public Hamster(int age, String name) {
        super(age, name);
    }

    public Hamster() {
        System.out.println("class Hamster is initialization fourth");
    }

    @Override
    public String showRefCount() {
        return "Hamster refCount: " + id;
    }

    @Override
    public String toString() {
        return "Hamster: " + "\n" + "jump cm: " + jump(hamsterJump)
                + ", eat: " + eat(hamsterEat) + ", say: " + say(hamsterSay)
                + "\n" + "Class Hamster used methods from Rodent base class";
    }
}
