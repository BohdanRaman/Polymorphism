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

        cycle.setCountWheels(10);
        unicycle.setCountWheels(1);
        bicycle.setCountWheels(2);
        tricycle.setCountWheels(3);
        System.out.println(cycle.ride(1) + ", " + cycle.getCountWheels());
        System.out.println(unicycle.ride(2) + ", " + unicycle.getCountWheels());
        System.out.println(bicycle.ride(3) + ", " + bicycle.getCountWheels());
        System.out.println(tricycle.ride(4) + ", " + tricycle.getCountWheels() + "\n");

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
        FirstClass fClass = new SecondClass();  // upcast to the base type
        fClass.firstMethod();                   // called the first method.
        System.out.println();
        /* In result of called the first method base class and the overridden method the second class.
        In this case (upcast), I can call only method base class.
        I can't call a child class methods which extension this class. */

        /*task 9, 12, 14 */
        System.out.println("Task 9, 12, 14: ");
        System.out.println("realization task 9: ");
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();
        for (Rodent variableRodent : rodents) {
            System.out.println(variableRodent + "\n");
        }
        System.out.println();

        System.out.println("realization task 12: ");
        Rodent[] rodents1 = new Rodent[3];
        rodents1[0] = new Mouse(1, "Mikky Mouse");
        rodents1[1] = new Gerbil(2, "mini Mouse gerbil");
        rodents1[2] = new Hamster(3, " Hamster Pip");
        for (Rodent variableRodent : rodents1) {
            System.out.println("Age rodent: " + variableRodent.getAge() + "; name rodent: " + variableRodent.getName());
        }
        System.out.println("---------------------------------------------");

        Hamster hamster = new Hamster();
        System.out.println(hamster);
        System.out.println();

        /* realization task 14*/
        System.out.println("realization task 14: ");
        Rodent[] rod = {new Rodent(), new Mouse(), new Gerbil(), new Hamster()};
        for (Rodent variableRodent : rod) {
            System.out.println();
            System.out.println(variableRodent.showRefCount());
        }
    }
}
