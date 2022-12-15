package task_12;

public class Hamster extends Gerbil{
    @Override
    public String say(String voice) {
        System.out.println("Hamster say: ");
        return voice;
    }

    @Override
    public int jump(int cm) {
        return cm;
    }

    @Override
    public int eat(int gram) {
        return gram;
    }
}
