package org.section4.strings_printing;

public class Printing {
    public static void main(String[] args) {
        System.out.println("pringing println");
        System.out.print(3);
        System.out.print("wrinting  nextline");
        System.out.println("print format");
        String a = "hello";
        int i =12345;
        System.out.printf("%d",i);
        System.out.println(" ");
        System.out.println("    1. using width :");
        System.out.printf("%10d",i);
        System.out.println(" ");
        System.out.println("   2. using pricision:");
        float f= 12.34567F;
        System.out.printf("%3.2f", f);
        System.out.println( " ");
        System.out.println(" 3. Flags:   ");
       // System.out.println(" ");
        System.out.println(" 3.1  using left justifing - :");
        System.out.printf("%-10d",i);
        System.out.println(" ");
        System.out.println(" 3.2  sign + :");
        System.out.printf("%+10d",i);
        System.out.println(" ");
        System.out.println(" 3.3   zero padding : by adding 0 ");
        System.out.printf("%010d",i);
        System.out.println(" ");
        System.out.println(" 3.4 comma saparator ,");
        System.out.printf("%,d",i);


    }
}
