package org.section3.operators;

public class Assignment_Operator {
    public static void main(String[] args) {
        int a = 10;
        a += 5;  // a = a + 5, now a = 15
        System.out.println("a += 5: " + a);

        a -= 3;  // a = a - 3, now a = 12
        System.out.println("a -= 3: " + a);

        a *= 2;  // a = a * 2, now a = 24
        System.out.println("a *= 2: " + a);

        a /= 4;  // a = a / 4, now a = 6
        System.out.println("a /= 4: " + a);

        a %= 5;  // a = a % 5, now a = 1
        System.out.println("a %= 5: " + a);

        a <<= 2; // a = a << 2, left shift, now a = 4
        //a=1 0001(in binary) after shifting 2 bit pos 0100 which is 4 in decimal
        System.out.println("a <<= 2: " + a);

        a >>= 1; // a = a >> 1, right shift, now a = 2
        //a =4 -> 0100  right shift a= 0010 which is 2
        System.out.println("a >>= 1: " + a);

        a &= 1;  // a = a & 1, bitwise AND, now a = 0
        //a=2 = 0010 & 0001 = 0000 -> 0
        System.out.println("a &= 1: " + a);

        a |= 3;  // a = a | 3, bitwise OR, now a = 3
        //a= 0  = 0000 | 0011 -> 0011
        System.out.println("a |= 3: " + a);

        a ^= 2;  // a = a ^ 2, bitwise XOR, now a = 1
        //a= 3 = 0011 ^ 0010 = 0001
        System.out.println("a ^= 2: " + a);
    }
}
