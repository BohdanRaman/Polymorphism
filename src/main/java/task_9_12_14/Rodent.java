package task_9_12_14;

/**
 * Exercise 9: Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,
 * etc. In the base class, provide methods that are common to all Rodents, and override these
 * in the derived classes to perform different behaviors depending on the specific type of
 * Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call
 * your base-class methods to see what happens
 * <p>
 * Exercise 12: Modify Exercise 9 so that it demonstrates the order of initialization of
 * the base classes and derived classes. Now add member objects to both the base and derived
 * classes and show the order in which their initialization occurs during construction.
 * <p>
 * Exercise 14: Modify Exercise 12 so that one of the member objects is a shared object
 * with reference counting, and demonstrate that it works properly.
 */

public class Rodent {
    private int age;
    private String name;
    private static long counter = 1;
    private final long id = counter++;

    /**
     * Counter:
     * The method  'showRefCount' show reference amount in our a class.
     * The static variable belong a class. So I should in each a class write static variable 'counter'.
     * I write final  'counter++' because this variable value will not change.
     * If I don't write fields 'counter' and 'counter++' and don't use overridden method 'showRefCount',
     * then to previous 'refCount' added just unit.
     */

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


    public String showRefCount() {
        return "Rodent refCount: " + id;
    }

    public String say(String voice) {
        System.out.println("Rodent can: ");
        return voice;
    }

    public String eat(int gram) {
        return gram < 50 ? " Eats little" : "Eats a lot";
    }

    public int jump(int cm) {
        return getJump(cm);
    }

    public int getJump(int rodentJump) {
        if (rodentJump < 0) {
            System.out.println("Rodent can't so jump");
        }
        if (rodentJump > 0 && rodentJump < 5) {
            System.out.println("Rodent has a small jump");
        }
        if (rodentJump >= 5) {
            System.out.println("Rodent has a big jump");
        }
        return rodentJump;
    }
}
