package task_9_12_14;

public class Hamster extends Gerbil {
    private static long counter = 0;
    private final long id = counter++;
    private final int hamsterJump = 3;
    private final int hamsterEat = 16;
    private final String hamsterSay = "yui yiu";

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
        return "Hamster: " + "\n"
                + "eat: " + eat(hamsterEat) + "\n"
                + "say: " + say(hamsterSay)+ "\n"
                + "jump cm: " + jump(hamsterJump)+ "\n"
                + "Class Hamster used methods from Rodent base class";
    }
}
