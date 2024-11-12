package org.section3.operators;

public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("Type casting operators convert one data type to another. In Java, there are two types of casting: implicit and explicit.");
        System.out.println("Implicit Casting (Widening): Converts a smaller data type to a larger one automatically.");

        int a = 100;
        double d = a; // implicit casting: int to double
        System.out.println("Implicit cast (int to double): " + d); // 100.0

        System.out.println("Explicit Casting (Narrowing): Converts a larger data type to a smaller one and requires explicit syntax. java Copy code\n");

        double d1 = 100.45;
        int a1 = (int) d1; // explicit casting: double to int
        System.out.println("Explicit cast (double to int): " + a1); // 100
    }
}
