package org.section6.loops;

import java.util.Scanner;

public class practiceProblems {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Find muiltiplication number ,");
        System.out.println(" \n enter  number : ");
        int t = sc.nextInt();
        for( int i =1; i<=10; i++){
            System.out.println(t +" X " + i + " = "+ t*i );
        }
        System.out.println("------------------------------");

        System.out.println(" \nFind Sum of a number");
        System.out.println(" enter number to find sum:");
        int n= sc.nextInt();
        int sum =0;
        for(int i=1; i<=n ; i++)
        {
            sum = sum+i;
        }
        System.out.println(" sum of "+ n + "number is : "+ sum);

        System.out.println("------------------------------");

        System.out.println("\n Find Factorial of a number");
        System.out.println(" enter number:");

        int f = sc.nextInt();
        int fact =1;
        for(int i=1; i<f; i++){
            fact = fact * i;
        }
        System.out.println( "factorial of  n : " +fact);
    }
}
