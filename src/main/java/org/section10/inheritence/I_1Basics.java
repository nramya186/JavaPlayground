package org.section10.inheritence;

public class I_1Basics {
    public static void main(String[] args) {
        System.out.println("Inheritance: " +
                "\n * Acquiring the properties of one class to the other class is called as inheritance."+
                "\n * Note: Java does not support multiple inheritance with classes (to avoid ambiguity) but supports it with interfaces."+
                "\n * The extends keyword is used to inherit a class."+
                "\n     Syntax : \n" +
                "   class Parent { " +
                             "\n        // Parent class properties and methods\n" +
                             "      }\n " +
                "  class Child extends Parent { " +
                        " \n       // Child class properties and methods\n" +
                        "       } \n");

        System.out.println(" * Constructors are not inherited.\n" +
                           " * The parent class's constructor is called automatically (implicitly) or manually (explicitly) in the child class.");

        Cylender c = new Cylender();
        c.radius=7;
        c.hight=10;
        System.out.println("value"+c.volume()
        +"\n area: "+c.area() + " "+c.circumference());
    }
}

//Parent class
class  Circle{
    public double radius;
    public double area(){
        return Math.PI* radius* radius;
    }
    public  double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
//child class
class Cylender extends Circle{
    public  double hight;
    public double volume(){
        return area()*hight;
    }
}