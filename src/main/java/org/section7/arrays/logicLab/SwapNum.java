package org.section7.arrays.logicLab;

public class SwapNum {
    public static void main(String[] args) {
        int a=10,b=20;
        swalp(a,b);
        swapWithoutTemp(a,b);
    }

    private static void swapWithoutTemp(int a, int b) {
        System.out.println(" without temp variable ");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a 10:"+a+" b 20:"+b);
    }

    private static void swalp(int a, int b) {
        System.out.println(" swap using temp :");
        int temp =a;
        a=b;
        b=temp;
        System.out.println("a 10:"+a+"b 20:"+b);
    }
    
    
}
