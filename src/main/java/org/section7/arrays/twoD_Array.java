package org.section7.arrays;

public class twoD_Array {
    public static void main(String[] args) {
        System.out.println("2D arrays: array of arrays");
        System.out.println("Declaration : dataType[][] arrayName");
        System.out.println("Creation : arrayName = new dataType[rows][columns];");
        System.out.println("Declaration and initialization : int[][] matrix = new int [2][2];");
        int matrix[][]= new int[2][2]; // declaration
        // initialization
        matrix[0][0]=3;
        matrix[0][1]= 5;
        matrix[1][0]=6;
        matrix[1][1]=6;

         for(int i=0;i< matrix.length;i++){
             for(int j=0;j<matrix[0].length;i++){
                 System.out.print(matrix[i][j]);
             }
             System.out.println(" ");
         }
        for( int[] row: matrix){
            for(int element : row){
                System.out.print(element+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(" direct initialization:");
        int[][] matrix1 ={
                {2,3,5},
                {3,5,6},
                {4,5,6}
        };
        System.out.println(matrix1[1][2]);



    }
}
