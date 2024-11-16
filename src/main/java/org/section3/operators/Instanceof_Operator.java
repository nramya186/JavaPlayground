package org.section3.operators;

public class Instanceof_Operator {
    public static void main(String[] args) {
        System.out.println("The instanceof operator checks if an object is an instance of a specific class or interface.\n" +
                "java\n" +
                "Copy code\n");
        String str = "Hello, Java!";
        System.out.println("str instanceof String: " + (str instanceof String)); // true

        Object obj = Integer.valueOf(10);
        System.out.println("obj instanceof Integer: " + (obj instanceof Integer)); // true
        System.out.println("obj instanceof String: " + (obj instanceof String));   // false
    }
}
