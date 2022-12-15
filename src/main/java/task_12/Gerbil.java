package task_12;

public class Gerbil extends Mouse{
    @Override
    public String say(String voice) {
        System.out.println("Gerbil say: ");
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
