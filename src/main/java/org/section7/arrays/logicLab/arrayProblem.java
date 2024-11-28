package org.section7.arrays.logicLab;

import java.util.Scanner;

public class arrayProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Finding Sum of all the elements
        int ele[] = {3, 5, 6};
        int sum = 0;
        for (int i = 0; i < ele.length; i++) {
            sum = sum + ele[i];
        }
        System.out.println(" sum is :" + sum);

        //Searching an elements

        System.out.println("Searching element from  array");
        System.out.println(" enter lenght of a array:");
        int l = 0; // length of array
        l = sc.nextInt();
        int a[] = new int[l];

        System.out.println(" enter the " + l + " elements");
        for (int j = 0; j < a.length; j++) {
            System.out.print(" enter  element: ");
            a[j] = sc.nextInt();
        }
        System.out.println(" user enter elements: ");
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }

        System.out.println(" enter element which you want t0 search :");
        int find = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == find) {
                System.out.println(find + " is in the array position :" + i);
            }
        }

        //Finding Max element
        System.out.println(" finding max element in array ");
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= max) {
                max = a[i];
            }
        }
        System.out.println(" max value is " + max);

        //Finding second large element
        System.out.println(" Finding second large element");

        int max1, max2;
        max1 = max2 = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) {
                max2 = a[i];
            }
        }
        System.out.println(" sum 1 :" + max1 + " sum 2: " + max2);

    }
}
