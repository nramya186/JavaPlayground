package org.section7.arrays.logicLab;

import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.Create a 3x3 matrix.
        //2.Populate the matrix with user input or hardcoded values.
        //3.Calculate and display the sum of all elements in the matrix.
        //4.Display the matrix in a grid format.
/*

        System.out.println("1. Create a 3x3 matrix. ");
        int[][] matrix = new int[3][3];
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length; j++){
                System.out.println("enter the "+i +" th row "+ j+" th column element: ");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("2.Display User entered value in grid format:");
        for (int a[]:matrix){
            System.out.print("[ ");
            for (int b:a){
                System.out.print(b +" ");
            }
            System.out.println("]");
        }
        System.out.println("3.sum of all the elements in matrix");
        int sum =0;
        for (int a[]: matrix){
            for (int b: a){
                sum = sum + b;
            }
        }
        System.out.println( "sum: "+ sum);

*/

        // Define two 3x3 matrices
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        // Perform matrix addition
         int additionResult[][]=new int[3][3];
         for (int i=0;i<3;i++){
             for (int j =0 ;j<3;j++){
                 additionResult[i][j]=matrix1[i][j]+matrix2[i][j];
                 System.out.print(additionResult[i][j] +" ");
             }
             System.out.println();
         }
        System.out.println("additionResult[][] "+ additionResult);

        // Perform matrix subtraction
        int subtractionResult[][]=new int[3][3];
        for (int i=0;i<3;i++){
            for (int j =0 ;j<3;j++){
                subtractionResult[i][j]=matrix1[i][j]-matrix2[i][j];
                System.out.print(subtractionResult[i][j]+" ");
            }
            System.out.println();
        }

    }
}
