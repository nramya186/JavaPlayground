package org.section11.abstactclass;
// Interface A
interface A {
    void methodA(); // Abstract method
}

// Interface B
interface B {
    void methodB(); // Abstract method
}

// Interface C extends A and B (Multiple Inheritance with Interfaces)
interface C extends A, B {
    void methodC(); // New abstract method added by C
}

// Class D implements Interface C
class D implements C {
    @Override
    public void methodA() {
        System.out.println("Method A from Interface A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B from Interface B");
    }

    @Override
    public void methodC() {
        System.out.println("Method C from Interface C");
    }
}
class P {
    void methodP(){
        System.out.println("Method P from Class P");
    }
        }
interface Q{
    default void defaultmethod(){
        System.out.println(" method default from interface Q");
        System.out.println(" java 8 feature default method");
    }
}
class R extends P implements A, Q{

    @Override
    public void methodA() {
        System.out.println(" class R override method A ");
    }
}
// Main class to test
public class MultipleInheritence_By_Interface {
    public static void main(String[] args) {
        D obj = new D();


        System.out.println("Interface A   Interface B\n" +
                "      \\         /\n" +
                "       \\       /\n" +
                "       Interface C\n" +
                "           |\n" +
                "        Class D");
        // Accessing methods from all interfaces through the object of D
        obj.methodA(); // From Interface A
        obj.methodB(); // From Interface B
        obj.methodC(); // From Interface C


        System.out.println("Class P     Interface A   Interface Q     \n" +
                "      \\         |        /\n" +
                "       \\        |       /\n" +
                "           Class  R  " );
        R r = new R();
        r.methodA();  // from interface A
        r.methodP(); // from class p
        r.defaultmethod(); // from the interface Q

    }
}
