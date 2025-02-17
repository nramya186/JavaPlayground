package org.section11.abstactclass;

public interface Animal_Interface {
   void sound(); //abstact method

    default void sleep(){
        System.out.println("sleeping");
        System.out.println("   - Default Methods: Introduced in Java 8, interfaces can have methods with a default implementation.");
    }

    static void info(){
        System.out.println("All animals have unique sounds");
        System.out.println("  -  Calls the static method in the interface. ");
        System.out.println("   - Use the interface's name, followed by the dot operator (.), to access its static members.");
    }

}
