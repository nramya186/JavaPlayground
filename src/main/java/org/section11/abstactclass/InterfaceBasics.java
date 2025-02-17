package org.section11.abstactclass;

public class InterfaceBasics {
    public static void main(String[] args) {
        System.out.println("     ••••••  Interface   •••••   : \n" +
                "interface in Java is a blueprint for a class. It is a collection of abstract methods (methods without a body) and constants (static and final variables). " +
                "• It is used to specify a set of behaviors that classes must implement," +
                "• Inheritance is completely used for achieving Polymorphism. \n" +
                "• Interface can be call as Abstract Class with all abstract methods.\n" +
                "• All the methods are by default abstract.\n" +
                "• Method can't be made private .as class need to implement\n" +
                "• Identifiers can be used in interface as Uppercases ex: int MAX_NUM = 100;\n" +
                "• Interface Method can have body if method is static \n" +
                "• Static method can accessed by using the main method, by interface name and dot . ex: s.o.p( Myinterface.variablename )\n" +
                "• Interface can be extend from another interface , but interface implements interface\n \n");

        Dog myDog = new Dog();
        myDog.sound(); // Calls the abstract method implemented by the Dog class
        myDog.sleep(); // Calls the default method in the interface
        Animal_Interface.info(); // Calls the static method in the interface

        System.out.println("\n \n     Interface   vs multiple Interface: \n \n" +
                "Multiple Inheritance in Java is Achieved Using Interfaces.\n" +
                "In Java, classes do not support multiple inheritance directly due to the \"Diamond Problem\" (confusion caused by ambiguity when two parent classes have the same method).");
    }
}
