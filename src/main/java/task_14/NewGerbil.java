package task_14;

public class NewGerbil extends NewRodent{

    private NewRodent newRodent;
    private static long counter = 0;
    private final long id = counter++;

    public NewGerbil(NewRodent newRodent) {
        System.out.println(("Creating "));
        this.newRodent = newRodent;
        this.newRodent.addRef();
    }

  public   void chooseColor() {
        System.out.println("Gerbil is braun color");
    }
}
