package org.section3.operators;

public class Logical_Operator {
    public static void main(String[] args) {
        System.out.println(" The logical && operator doesn't check the second condition if the first condition is false. It checks the second condition only if the first one is true.\n" +
                "\n" +
                "The bitwise & operator always checks both conditions whether first condition is true or false.");

       /* int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b&&a<c);//false && true = false
        System.out.println(a<b&a<c);//false & true = false*/



        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b&&a++<c);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a<b&a++<c);//false && true = false
        System.out.println(a);//11 because second condition is checked

        System.out.println("The logical || operator doesn't check the second condition if the first condition is true. It checks the second condition only if the first one is false.The bitwise | operator always checks both conditions whether first condition is true or false.\n" +
                "\n");
        int a2=10;
        int b2=5;
        int c2=20;
        System.out.println(a2>b||a<c);//true || true = true
        System.out.println(a2>b|a<c);//true | true = true
//|| vs |
        System.out.println(a2>b||a++<c);//true || true = true
        System.out.println(a2);//10 because second condition is not checked
        System.out.println(a2>b|a++<c);//true | true = true
        System.out.println(a2);//11 because second condition is checked

        boolean aa = true, bb = false;
        System.out.println(aa && bb); // Output: false
        System.out.println(aa || bb); // Output: true
        System.out.println(!aa);     // Output: false
    }
}
