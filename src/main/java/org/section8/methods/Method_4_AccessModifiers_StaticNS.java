package org.section8.methods;

public class Method_4_AccessModifiers_StaticNS {
    public static void main(String[] args) {
        System.out.println("      Access Modifiers");
        System.out.println("It controls the visibility of the methods .\n");
        System.out.println("1. public: Accessible everywhere.\n" +
                           "2. private: Only accessible within the class.\n" +
                           "3. protected: Accessible within the package and subclasses.\n" +
                           "4. default: Accessible within the package (no modifier).");
        Method_4_AccessModifiers_StaticNS m= new Method_4_AccessModifiers_StaticNS();
        System.out.println(" public Access Modifier: "+ m.publicModifiersMethod());
        System.out.println(" Private Access Modifier: "+ m.privateModifiersMethod());
        System.out.println(" Modifier Access Modifier: "+ m.protectedModifierMethod());
        System.out.println(" Default Access Modifier: "+ m.defaultModifierMethod());

        System.out.println("\n   ** Static and Instance Methods  **");
        //Static method call
        displayStatic();
        //NonStatic method call
        Method_4_AccessModifiers_StaticNS staticNS = new Method_4_AccessModifiers_StaticNS();
        staticNS.displayNonStatic();
    }

    public String publicModifiersMethod(){
            return "access everywhere" ;
    }
    private String privateModifiersMethod(){
        return "only within the class";
    }
    protected String protectedModifierMethod(){
        return "Accessible within package and sub class";
    }
    String defaultModifierMethod(){
        return "within the package";
    }

    //Static method
    public static void displayStatic(){
        System.out.println("Static Methods: Belong to the class; invoked without an object.");
    }

    //non-Static method
    public void displayNonStatic(){
        System.out.println("Instance Methods: Belong to objects; invoked using an object.\n");
    }

}
