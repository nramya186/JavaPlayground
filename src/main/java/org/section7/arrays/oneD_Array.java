package org.section7.arrays;

public class oneD_Array {
    public static void main(String[] args) {
        System.out.println("Arrays:");
        System.out.println(" Arrays is a collection of similer data type");
        System.out.println(" Declaration :  int a[] = new int[5]");
        System.out.println(" Creating : int a[]={1,2,3,4};");
        System.out.println(" Access   :  a[2] // o/p : 3");
        System.out.println(" 1. Fixed Size: Once an array is created, its size cannot be changed.\n");
        System.out.println(" 2. Zero-Based Indexing: The first element is at index 0, and the last element is at length - 1.");
        System.out.println(" 3. Homogenous: all the element must be of same type");
        int a[] = {1, 2, 3, 4, 5, 666, 7};
        int b[] = new int[3];
        b[0] = 10;
        b[1] = 20;
        b[2] = 30;
        System.out.println("a[3]:" + a[3] + " b[2] :" + b[2]);
        System.out.println(" array a length is :" + a.length);
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }
        System.out.println(" creating array without array value ,by default jvm will assign  default value . ex: int default value 0");
        int c[] = new int[5];
        for (int i : c) {
            System.out.println(i);
        }
        System.out.println("Printing all element in array for loop will help");
        System.out.println("For each loop is specially for array:");
        System.out.println(" Syntax: for (dataType variable : arrayName)");
        int foreacha[] = {1, 23, 4, 55, 7, 8, 8999, 78, 9};
        for (int a1 : foreacha) {
            System.out.println("a1 array element :" + a1);
        }
        System.out.println(" for each loop automatically featches each elemnt from array ");
        System.out.println("");
    }
}
