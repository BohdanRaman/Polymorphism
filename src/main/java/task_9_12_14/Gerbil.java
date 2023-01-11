package task_9_12_14;


public class Gerbil extends Mouse {
    private static long counter = 0;
    private final long id = counter++;
    private int gerbilJump = 2;
    private int gerbilEat = 2;
    private String gerbilSay = "po p po";


    @Override
    public String showCount() {
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
        return "Gerbil: " + "\n" + "jump cm: " + jump(gerbilJump)
                + ", eat: " + eat(gerbilEat) + ", say: " + say(gerbilSay)
                + "\n" + "Class Gerbil used methods from Rodent base class";
    }
}
