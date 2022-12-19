package task_14;

public class NewMouse extends NewRodent {
    private NewRodent newRodent;
    private static long counter = 0;
    private final long id = counter++;

    public NewMouse(NewRodent newRodent) {
        System.out.println(("Creating "));
        this.newRodent = newRodent;
        this.newRodent.addRef();
    }

    public void chooseColor() {
        System.out.println("Mouse is grey color");
    }
}

