package org.section8.methods;

public class Method_5_AbstractMethod implements MyInterface{
    public static void main(String[] args) {
        System.out.println("   Abstract  Method ");
        System.out.println("Abstatc method is defined in Abstract class or interface without method body, and subclass ,must implement  them \n");

        Shape shape=new Circle();
        shape.draw();

        // Default and Static Methods in Interfaces
        System.out.println(" ** Default and Static Methods in Interfaces\n ");
        new Method_5_AbstractMethod().defaultMethod();//Default method
        MyInterface.staticMethod();  //static method

    }
}

abstract  class Shape{
    abstract void draw();
}

class Circle extends Shape{
    void draw() {
        System.out.println(" Darwing circle");
    }
}
//Default and Static Method In Interface
interface  MyInterface{
    default void defaultMethod(){
        System.out.println("Default Method");
    }

    static void staticMethod(){
        System.out.println("Static Method");
    }
}



