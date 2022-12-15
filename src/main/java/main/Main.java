package main;

import task_1.Bicycle;
import task_1.Cycle;
import task_1.Tricycle;
import task_1.Unicycle;
import task_10.FirstClass;
import task_10.SecondClass;
import task_12.Gerbil;
import task_12.Hamster;
import task_12.Mouse;
import task_12.Rodent;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        /*task 1, task 5*/
        System.out.println("Task 1 and task 5: ");
        Cycle cycle = new Cycle();
        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();

        cycle.ride();
        unicycle.ride();
        bicycle.ride();
        tricycle.ride();
        System.out.println();

        System.out.println(cycle.ride(1));
        System.out.println(unicycle.ride(2));
        System.out.println(bicycle.ride(3));
        System.out.println(tricycle.ride(4) + "\n");

        /*task 10*/
        System.out.println("Task 10: ");
        FirstClass fClass = new SecondClass();
        fClass.numberOneMethod();
        System.out.println();

        /*task 12*/
        System.out.println("Task 12: ");
        Rodent rodent = new Rodent();
        Rodent mouse = new Mouse();
        Rodent gerbil = new Gerbil();
        Rodent hamster = new Hamster();
        System.out.println(rodent.say("pi pi pi"));
        System.out.println("rodent eat: " + rodent.eat(1) + " gram");
        System.out.println("rodent jump: " + rodent.jump(1) + " cm");

        System.out.println(mouse.say("mi mi mi"));
        System.out.println("mouse eat: " + mouse.eat(2) + " gram");
        System.out.println("mouse jump" + mouse.jump(2) + " cm");

        System.out.println(gerbil.say("po p po"));
        System.out.println("gerbil jump: " + gerbil.jump(3) + " cm");
        System.out.println("gerbil eat: " + gerbil.eat(3) + " gram");

        System.out.println(hamster.say("yui yiu"));
        System.out.println("hamster eat: " + hamster.eat(4) + " gram");
        System.out.println("hamster jump: " + hamster.jump(4) + " cm");

    }
}
