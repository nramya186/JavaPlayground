package org.section6.loops;

public class NestedLoops {
    public static void main(String[] args) {
        System.out.println("Nested For Loop");
        for (int i = 1; i < 5; i++) { // row
            for (int j = 1; j < 5; j++) {// column
                System.out.print("(" + i + " , " + j + ") ");
            }
            System.out.println(" ");
        }
    }
}
