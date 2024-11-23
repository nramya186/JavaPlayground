package org.section4.strings_printing;

public class Strings_1 {
    public static void main(String[] args) {
        System.out.println("String is collection of characters");
        System.out.println("1.simple way declare is :  String str =\"java\" ; ");

        System.out.println("2.reference str is to holding object, with in double quote is literals");

        System.out.println("3.constructors are the method which is  for creating object");

        System.out.println("4. constructor for creating string :  1.String (char[])  2.String(byte[])  3.String(String)  ");
            System.out.println(" 4.1 creating String by array of character");
            System.out.println(" char c[]= {'A','B','C'} ");
            char c[]= {'A','B','C'};
            System.out.println("For creation of object we use keyword 'new'.\nString str1 = new String(c)");
            String str1 = new String(c);
            System.out.println("Creating string by set of char : "+ c +" Str 1 :"+ str1);

            System.out.println("4.2 creating string by byte array . where it takes asce code");
            byte b[]= {65,66,67,68,69,70};
            System.out.println(" byte b[]= {65,66,67,68,69,70};\n");
            String str2= new String(b,2,2);
            System.out.println(" byte :  " +b+" String str2: "+ str2);

        System.out.println("4.3");
        }
}
