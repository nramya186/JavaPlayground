package org.section8.methods;

public class Method_3_OverloadingRecursion {
    public static void main(String[] args) {
        System.out.println("  **Method Overloading: ** ");
        System.out.println("Methods having same name but different parameter");
        display(5);
        display("Hello");

        System.out.println("\n  ** Recursion : **");
        System.out.println("A method calls itself to solve smaller instance of problem.");
        System.out.println("Factorioal of 5 :"+factorial(5));
    }
    static void display(int num){
        System.out.println("num: "+num);
    }
    static void display(String str){
        System.out.println("Text:"+ str);
    }

    //Recursion
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n * factorial(n-1); //Recursive call
    }
}
