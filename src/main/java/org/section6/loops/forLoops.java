package org.section6.loops;

public class forLoops {
    public static void main(String[] args) {
        System.out.println("➢ For loop is a counter controlled loop.\n" +
                "➢ It is the most frequentl used loop.\n" +
                "➢ Syntax:for(initialization;condition;updation)");
        System.out.println("\n printing 10f - 0  decrement  number");
        for(int i=10; i>0; i--){
            System.out.println(i);
        }
        System.out.println("pring a  1-10 2 divisible numbers");
        for( int i=1,j=1; i<=10; i++,j=j*2){
            System.out.println(i +" "+ j);
        }

        System.out.println("\n Display multiplicaion table of 5:");
        for( int f= 1; f<=10; f++){
            System.out.println(f*5);
        }

    }
}
