package org.section6.loops.logicLab;

import java.util.Scanner;

public class LoopsProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter a positive number: ");
        number = scanner.nextInt();

        while (number <= 0) {
            System.out.println("Invalid input! Please enter a positive number: ");
            number = scanner.nextInt();
        }

        System.out.println("You entered a valid number: " + number);
        scanner.close();
    }
}
