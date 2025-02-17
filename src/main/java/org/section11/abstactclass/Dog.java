package org.section11.abstactclass;

public class Dog implements Animal_Interface {

    @Override
    public void sound() {
        System.out.println(" Dog sound woof wooof");
        System.out.println("Calls the abstract method implemented by the Dog class");
    }
}
