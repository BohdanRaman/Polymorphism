package task_9_12_14;

public class Mouse extends Rodent {
    private static long counter = 0;
    private final long id = counter++;
    private final int mouseJump = 6;
    private final int mouseEat = 65;
    private final String mouseSay = "mi mi mi";

    @Override
    public String showRefCount() {
        return "Mouse refCount: " + id;
    }

    public Mouse(int age, String name) {
        super(age, name);
    }

    public Mouse() {
        System.out.println("class Mouse is initialization second");
    }

    @Override
    public String toString() {
        return "Mouse: " + "\n"
                + "eat: " + eat(mouseEat) + "\n"
                + "say: " + say(mouseSay) +  "\n"
                + "jump cm: " + jump(mouseJump) + "\n"
                + "Class Mouse used methods from Rodent base class";
    }
}
