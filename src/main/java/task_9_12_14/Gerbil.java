package task_9_12_14;


public class Gerbil extends Mouse {
    private static long counter = 0;
    private final long id = counter++;
    private final int gerbilJump = 2;
    private final int gerbilEat = 2;
    private final String gerbilSay = "po p po";

    @Override
    public String showRefCount() {
        return "Gerbil refCount: " + id;
    }

    public Gerbil(int age, String name) {
        super(age, name);
    }

    public Gerbil() {
        System.out.println("class Gerbil is initialization third");
    }

    @Override
    public String toString() {
        return "Gerbil: " + "\n"
                + "eat: " + eat(gerbilEat)+ "\n"
                + "say: " + say(gerbilSay)+ "\n"
                + "jump cm: " + jump(gerbilJump)+ "\n"
                + "Class Gerbil used methods from Rodent base class";
    }
}
