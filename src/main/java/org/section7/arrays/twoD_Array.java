package org.section7.arrays;

public class twoD_Array {
    public static void main(String[] args) {
        System.out.println("2D arrays: \nIt is array of arrays, which used to represent tables or matrix \n");
        System.out.println("1.Declaration : dataType[][] arrayName");
        System.out.println("2.Creation : arrayName = new dataType[rows][columns];");
        System.out.println("3.Declaration and initialization : int[][] matrix = new int [2][2];");
        int matrix[][] = new int[2][2]; // declaration

        // initialization
        matrix[0][0] = 3;
        matrix[0][1] = 5;
        matrix[1][0] = 6;
        matrix[1][1] = 6;

        System.out.println(" print array using for loop");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println(" print array using for each loop");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println(" Direct initialization:");
        int[][] matrix1 = {
                {2, 3, 5},
                {3, 5, 6},
                {4, 5, 6}
        };
        System.out.println(" reading array element which on 1st row 2nd column  :" + matrix1[1][2]);

        //jagged array : array which have a different number of column in a row  there will be flexibility in row sizes.
        System.out.println("\n Jagged Array:");
        System.out.println("1. Declaration of jagged array : datatype[][] arrayName;");
        int[][] jaggedArray1;
        System.out.println("   Creation of jagged array : arrayName = new datatype[row][];");
        jaggedArray1 = new int[3][];   //3 rows
        System.out.println("   initialize row:  arrayName[rowIndex]= new dataType[NumOfcolumnsInThisRow]");
        jaggedArray1[0] = new int[2]; // Row 0 has 2 columns
        jaggedArray1[1] = new int[3]; // Row 1 has 3 columns
        jaggedArray1[2] = new int[4]; // Row 2 has 2 columns
        System.out.println("   Initialize the array: arrayName[rowIndex]= new dataType[]{2,5,6,7} ");
        jaggedArray1[0] = new int[]{2, 5};
        jaggedArray1[1] = new int[]{4, 6, 8};
        jaggedArray1[2] = new int[]{4, 3, 3, 9,};

        System.out.println("   Printing jagged array2 using for each loop: ");
        for (int row[] : jaggedArray1) {
            System.out.print("[");
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.print("]");
            System.out.println();
        }
        System.out.println("2. Direct Initialization: int[][] JaggedArray= { {1,2,3},{1,5},{2,3,4,5,}};");
        int[][] jaggedArray2 = {
                {1, 2, 3},
                {1, 5},
                {2, 3, 4, 5}
        };
        System.out.println("Printing jagged array2 using for loop:");
        for (int i = 0; i < jaggedArray2.length; i++) {
            for (int j = 0; j < jaggedArray2[i].length; j++) {
                System.out.print(jaggedArray2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
