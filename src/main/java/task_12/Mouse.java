package task_12;

public class Mouse extends Rodent{

    @Override
    public String say(String voice) {
        System.out.println("Mouse say: ");
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
