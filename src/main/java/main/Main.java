package main;

import cycle_class_task1.Bicycle;
import cycle_class_task1.Cycle;
import cycle_class_task1.Tricycle;
import cycle_class_task1.Unicycle;

public class Main {
    public static void main(String[] args) {
        /*task 1*/
        System.out.println("Task 1: ");
        Cycle cycle = new Cycle();
        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();
        cycle.ride();
        unicycle.ride();
        bicycle.ride();
        tricycle.ride();

        System.out.println(cycle.wheels(1));
        System.out.println(bicycle.wheels(2));
        System.out.println(unicycle.wheels(3));
        System.out.println(tricycle.wheels(4));
    }
}
