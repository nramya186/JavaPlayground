package org.section9.class_object;

public class C1_Class_Object_1 {
    public static void main(String[] args) {
        System.out.println("      ***** Class : *****");
        System.out.println("->  A class is a blueprint or template that defines the properties(fields) and behavior(method) that object created from the class will have .");
        System.out.println("->  No memory is allocated for it until objects are created.");
        System.out.println("      Class = Design /BluePrint");
        System.out.println("   Example: Think of a blueprint of a car.");


        System.out.println("\n     *****  Object :    ****");
        System.out.println("->  An object is an instance of a class. It represents a real-world entity with specific values for the properties and can perform actions defined by the methods of the class.\n" +
                "->  An object is the real thing created based on the class.\n" +
                "->  It has properties (state/fields) and behaviors (actions).");
        System.out.println("        Object = Actual Thing");
        System.out.println("  Example: The actual car built from the blueprint:\n" +
                "    Properties: Color = Red, Brand = Tesla, Speed = 100 km/h.\n" +
                "    Behaviors: Driving, Honking.");
        //An object is the real thing you create based on that design/blueprint.
        //It has a physical existence and specific values.
        //Properties: Variable that have the state of the object
        //behavior :Function that defines action or behavior of the object.
    }
}
//Example: Car
//Class //blueprint
class Car{
    String color;    //Property
    String brand;    //Property

    void drive(){
        System.out.println("The "+color+" "+brand+" is driving.");
    }
}

//Object (Actual car)
class Main{
    public static void main(String[] args){
        Car car1=new Car(); //Creating object
        car1.color= "Blue"; //setting property
        car1.brand="Tesla";
        car1.drive();  //calling behavior
        //o/p is : The blue tesla is driving
    }
}
