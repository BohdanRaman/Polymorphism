package task_9_12_14;

/**
 * Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,
 * etc. In the base class, provide methods that are common to all Rodents, and override these
 * in the derived classes to perform different behaviors depending on the specific type of
 * Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call
 * your base-class methods to see what happens
 */

public class Rodent {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rodent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Rodent() {
        System.out.println("class Rodent is initialization first");
    }

    public String say(String voice) {
        System.out.println("Rodent say: ");
        return voice;
    }

    public int jump(int cm) {
        return cm;
    }

    public int eat(int gram) {
        return gram;
    }
}
