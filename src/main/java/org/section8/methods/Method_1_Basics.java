package org.section8.methods;

public class Method_1_Basics {
    public static void main(String[] args) {
        System.out.println("Methods :");
        System.out.println("Methods are members of classes which provide functionality for classes.");
        System.out.println("Methods in Java are blocks of code designed to perform specific tasks. They allow you to reuse code, improve readability, and modularize programs. ");
        System.out.println("  Types of method : 1.predefined methods  2.user defined methods");
        System.out.println("      methods provided by java is predefined ex: System.out.println()");
        System.out.println("      methods which user create to perform specific task ");
        System.out.println("      syntax: returnType methodName(parameter list)  -> signature/header");
        System.out.println("1-> To call method from main method user need to create static method");
        System.out.println(method1(10, 5));
        System.out.println("2-> Method can be static(called without creating object) or instance(required an object \n");
        Method_1_Basics  m = new Method_1_Basics ();
        System.out.println("------Types of User-Defined methods------\n");
        System.out.println("1 No-returnType ,No Parameter");
        m.great();
        System.out.println("2 No-returnType ,with Parameter");
        m.great("Hello Code Aura");
        System.out.println("3. return Type, no parameter");
        System.out.println(m.greating());
        System.out.println("4. return Type, with parameter");
        System.out.println(m.greating(10,5));

        System.out.println("Note: A return type only gives back a value; it does not handle printing or displaying it.");
        int result =m.greating(20,30); // Storing result
        System.out.println(result);          // Printing result

        System.out.println("\n Special Methods: \n");
        System.out.println("* Main method : entry point of a Java Program");
        System.out.println("* Constructor : A Special method used to initialize objects");
    }

    //static method
    static int method1(int a, int b) {
        if (a > b) {
            System.out.println("a value:");
            return a;
        } else {
            return b;
        }
    }

    //No-Return Type, No Parameters
    void great() {
        System.out.println("hello");
    }
    //No-Return Type, with Parameters
    void great(String msg) {
        System.out.println(msg);
    }
    //Return Type, No Parameters
    int greating() {
        return 10;
    }
    //Return Type, with Parameters
    int greating(int a,int b){
        return a+b;
    }
}
