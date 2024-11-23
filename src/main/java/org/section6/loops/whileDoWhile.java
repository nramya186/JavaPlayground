package org.section6.loops;

public class whileDoWhile {
    //Loops	are	repeating	statements.
    //There	are	four	types	of	loops.
    //In	loops	the	steps	are	repeated	till	the	given	condition	is	reached.
    public static void main(String[] args) {
        System.out.println("\nWhile loop :");
        System.out.println("\tThe steps are executed if the condition is true.\n" +
                            "\tThe condition is checked irst and the process is followed. \n" +
                            "\tIt is a pre-tested loop \n" +
                           "\tIf the condition is false then the process is never executed.\t");

        System.out.println("\nprint powers of 2 within number 100:");
                            int i=1;
                            while(i<100){
                                i=i*2;
                                System.out.println(i);
                            }

        System.out.println("\nprinting the squre numbers :");
                            int j =1;
                            while(j<=10){
                            int n = j*j;
                            System.out.println(j + " : "+ n);
                            j++;
                    }
        System.out.println("Do while :");
        System.out.println(" First process is followed and then the condition is checked"
        +"\n it is pre tested loop , if the condition false the process is executed atleast once");

        System.out.println(" printing odd number within 10");
        int k = 1;
        do {
            if (k % 2 == 1) {
                System.out.println(k);
            } k++;
        }while (k<10) ;

    }
}
