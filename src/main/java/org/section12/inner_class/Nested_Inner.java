package org.section12.inner_class;

class Outer {
    private String message = "Hello from Outer Class";

    // Nested Inner Class
    class Inner {
        void displayMessage() {
            System.out.println(message); // Accessing outer class member
        }
    }
}


public class Nested_Inner {
    public static void main(String[] args) {
        Outer outer = new Outer(); // Create outer class object
        Outer.Inner inner = outer.new Inner(); // Create inner class object
        inner.displayMessage(); // Call method of inner class

        System.out.println(" Direct Create inner class object : Outer.Inner inner = new Outer().new Inner();");
        Outer.Inner d_inner = new Outer().new Inner();
        d_inner.displayMessage();

    }

}
