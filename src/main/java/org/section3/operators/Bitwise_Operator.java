package org.section3.operators;

public class Bitwise_Operator {
    public static void main(String[] args) {
        int a = 5;  // binary: 0101
        int b = 3;  // binary: 0011

        System.out.println("a & b: " + (a & b));   // 1 (0001)
        System.out.println("a | b: " + (a | b));   // 7 (0111)
        System.out.println("a ^ b: " + (a ^ b));   // 6 (0110)
        System.out.println("~a: " + (~a));         // -6 (two's complement of 5)

        System.out.println("a << 1: " + (a << 1)); // 10 (binary: 1010, left shift by 1)
        System.out.println("a >> 1: " + (a >> 1)); // 2  (binary: 0010, right shift by 1)
        System.out.println("a >>> 1: " + (a >>> 1));// 2  (unsigned right shift by 1)

        System.out.println("<< (Left Shift): Shifts bits to the left, filling with zeros.\n" +
                ">> (Right Shift): Shifts bits to the right, keeping the sign bit (for negative values).\n" +
                ">>> (Unsigned Right Shift): Shifts bits to the right, filling with zeros regardless of the sign.");
    }
}
