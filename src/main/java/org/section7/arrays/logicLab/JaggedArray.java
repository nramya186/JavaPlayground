package org.section7.arrays.logicLab;

import java.util.Scanner;

public class JaggedArray {
    //Write a Java program to handle a jagged array representing student marks:
    //Each student has a different number of subjects.
    //Store the marks of 3 students, where:
    //Student 1 has marks for 2 subjects.
    //Student 2 has marks for 3 subjects.
    //Student 3 has marks for 4 subjects.
    //Calculate and display the average marks for each student.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float student[][] = new float[3][]; //creation
        student[0] = new float[2];
        student[1] = new float[3];
        student[2] = new float[4];

       /* //initialization
        for(int i=0;i<student.length;i++){
            for (int j=0;j<student[i].length;j++){
                System.out.println("Enter ["+i+"] th students["+j+"] th subject marks :");
                student[i][j]= sc.nextFloat();
            }
        }*/
        student[0]=new float[]{78,65};
        student[1]=new float[]{34,65,78};
        student[2]=new float[]{76,85,90,88};

         //displaying marks
        for(float i[]: student){
            System.out.print("[");
            for (float j:i){
                System.out.print( j+" ");
            }
            System.out.println("]");
        }

        // Calculate and display average marks for each student
        for (int i=0;i<student.length;i++){
            int sum=0;
            for (int j=0;j<student[i].length;j++) {
                sum += student[i][j];
            System.out.println(i+" sum: "+sum);
            System.out.println("avg is: " +sum/student[i].length);
        }
        }

    }

}
