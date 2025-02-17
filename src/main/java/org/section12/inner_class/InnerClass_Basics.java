package org.section12.inner_class;

public class InnerClass_Basics {
    public static void main(String[] args) {
        System.out.println("   •••• InnnerClass or Nested Class •••••\n" +
                "Class inside another class is Inner class  . Inner classes help logically group classes that are used only in one place, improving code readability and encapsulation." +
                " there are 4 types: \n" +
                "       1.Nested Inner class \n"+
                "       2.Local Inner class  \n"+
                "       3.Anonymous Inner class \n" +
                "       4.Static Inner class \n ");

        System.out.println("• inner class .class file is stored  as(using $)  : ]n" +
                "    ••••  Outer$Inner.class \n"+
                 " To directly access the Inner class : \n" +
                "Outer.Inner i = new Outer().new Inner()");
    }
}
