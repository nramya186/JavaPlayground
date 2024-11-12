package org.section3.operators;

public class Arthematic_Operator {
    public static void main(String[] args) {
        System.out.println("1. Java arithmetic operators are used to perform addition, subtraction, multiplication, and division. They act as basic mathematical operations.");
        int a=10;
        int b=5;
        System.out.println(a+b);//15
        System.out.println(a-b);//5
        System.out.println(a*b);//50
        System.out.println(a/b);//2
        System.out.println(a%b);//0
   //for float values
        float a1=14.3f,b1=3.2f;

        float c=a1/b1;
        float r=a1%b1;
        System.out.println(10*10/5+3-1*4/2);

            // for different data types
        byte a2=10;
        short b2=15;
        int c2=a2+b2;
        System.out.println("c2 value :"+ c2);
        float a3=12.5f;
        long b3=1231;
        float c3=a2*b2;
        System.out.println("c3 value :"+ c3);

        float a4=12.5f;
        double b4=123;
        double c4=a*b;
        System.out.println("c4 value :"+ c4);

        char a5=40;
        int b5=30;
        int c5=a5-b5;
        System.out.println("c5 value :"+ c5);

        System.out.println((10+20)/2);
        System.out.println(10/(2*5));

    }
}
