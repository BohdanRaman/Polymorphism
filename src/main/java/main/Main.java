package main;

import cycle_class_task1.Bicycle;
import cycle_class_task1.Cycle;
import cycle_class_task1.Tricycle;
import cycle_class_task1.Unicycle;
import task_10.FirstClass;
import task_10.SecondClass;

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
        System.out.println(tricycle.ride(4));

        /*task 10*/
        System.out.println("Task 10: ");
        FirstClass firstClass = new SecondClass();

    }
}
