package org.section6.loops.logicLab;

public class Patterns {
    // print pattern in 1-5 in x and y line like squre box
    public static void main(String[] args) {
        System.out.println("printing numbers 1-5 in single row in squre shape");
        for(int i=1 ;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" pring 1-4 in a row");
        for (int i=1; i<5;i++){
            for(int j =1;j<5;j++){
                System.out.print(i +" ");
            }
            System.out.println(" ");
        }

        System.out.println(" printing 11111 in arow like squire box ");

        for (int i=1; i<5;i++){
            for(int j =1;j<5;j++){
                System.out.print("1 " );
            }
            System.out.println(" ");
        }

        System.out.println(" print  first row 2 3 4 5 6" +
                "second row 3 4 5 6 7 8  and so on");
        for (int i=1; i<=5;i++){
            for(int j =1;j<=5;j++){
                System.out.print(i+j+" " );
            }
            System.out.println(" ");
        }

        System.out.println(" Print 1-25 in squre shape ");
        int count =0;
        for (int i=1;i<=5;i++){
            for( int j=1;j<=5;j++){
                count++;
                System.out.format("%02d ", count); // format in 2 digit  to get squre shape
            }
            System.out.println(" ");
        }
        System.out.println(" print  in piramid shape  ");
        for (int i=1; i<=5;i++){
            for(int j =1;j<=i;j++){
                    System.out.print(j +" ");
            }
            System.out.println(" ");
        }
        for (int i=1; i<=5;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*" +" ");
            }
            System.out.println(" ");
        }

        System.out.println(" Print 1-15 in trianle  shape");
        count=0;
        for( int i =1;i<=5;i++){
            for(int j =1;j<=i;j++){
                count++;
                System.out.print(count+" "); // else write format %20d
            }
            System.out.println(" ");
        }
        System.out.println(" print triangle 1-5 in reverse");
        for (int i=1; i<=5;i++){
            for(int j =1;j<=5-i+1;j++){ //  //j<=6-i
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }
        System.out.println(" print * triangle  ");

        for (int i=1; i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i<=j){
                    System.out.print("*" );}
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" prnting ");
        for (int i=1; i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i+j>5){
                    System.out.print("*" );}
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" print piramid");
        for (int i=1; i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i+j>5){
                    System.out.print("*" );}
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }


    }
}
