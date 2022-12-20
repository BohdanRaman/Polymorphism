package main;

import task_1_17.Bicycle;
import task_1_17.Cycle;
import task_1_17.Tricycle;
import task_1_17.Unicycle;
import task_10.FirstClass;
import task_10.SecondClass;
import task_9_12_14.Gerbil;
import task_9_12_14.Hamster;
import task_9_12_14.Mouse;
import task_9_12_14.Rodent;

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

        Cycle[] arrayCycle = new Cycle[3];
        arrayCycle[0] = new Bicycle();
        arrayCycle[1] = new Tricycle();
        arrayCycle[2] = new Unicycle();
        /* I can't call method balance(), because it didn't create in base class*/

        ((Bicycle) arrayCycle[0]).balance();
        ((Unicycle) arrayCycle[2]).balance();
        //  ((Tricycle) arrayCycle[2]).balance(); Error, I should to create balance method in class Tricycle.
        System.out.println();

        /*task 10*/
        System.out.println("Task 10: ");
        FirstClass fClass = new SecondClass();
        fClass.numberOneMethod();
        System.out.println();

        /*task 9, 12 */
        System.out.println("Task 9, 12: ");
        /* realization task 9*/
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();
        for (Rodent r : rodents) {
            System.out.println(r);
        }
        System.out.println("---------------------------------------------");

        /* realization task 12*/
        Rodent[] rodents1 = new Rodent[3];
        rodents1[0] = new Mouse(1, "Mikky Mouse");
        rodents1[1] = new Gerbil(2, "mini Mouse gerbil");
        rodents1[2] = new Hamster(3, " Hamster Pip");
        for (Rodent rrr : rodents1) {
            System.out.println("Age rodent: " + rrr.getAge() + "; name rodent: " + rrr.getName());
        }
        System.out.println("---------------------------------------------");

        Hamster hamster = new Hamster();
        System.out.println(hamster);
        System.out.println();

        /* realization task 14*/
        System.out.println("Task 14: ");
        Rodent rodent = new Rodent();
        Rodent[] r = { new Mouse(rodent), new Gerbil(), new Hamster()};
        for (Rodent rrr : r) {
            System.out.println(rrr);
        }


    }
}
