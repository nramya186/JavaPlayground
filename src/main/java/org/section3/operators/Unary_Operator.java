package org.section3.operators;

public class Unary_Operator {
    public static void main(String[] args) {
        System.out.println("The Java unary operators require only one operand. Unary operators are used to perform various operations i.e.:incrementing/decrementing a value by one\n" +
                "negating an expression\n" +
                "inverting the value of a boolean");

        int x=10;
        System.out.println("x++ : "+ x++);//10 (11)
        System.out.println("++x : "+ ++x);//12
        System.out.println("x-- : " + x--);//12 (11)
        System.out.println("--x : " + --x);//10
        System.out.println("~x : "+ ~x);
        boolean y = false;
        System.out.println("!y : "+ !y);

        System.out.println("  with ++ --");
        int a=10;
        int b=10;
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21
    }
}
