package org.section6.loops.logicLab;

import java.util.Scanner;

public class DoWhileAtm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CORRECT_PIN = 1234; // Assume 1234 is the correct PIN
        int enteredPin;
        int attempts = 3;

        do {
            System.out.print("Enter your PIN: ");
            enteredPin = scanner.nextInt();

            if (enteredPin == CORRECT_PIN) {
                System.out.println("Access Granted. Welcome!");
                break; // Exit the loop if the PIN is correct
            } else {
                attempts--;
                System.out.println("Incorrect PIN. Attempts left: " + attempts);
            }

        } while (attempts > 0);

        if (attempts == 0) {
            System.out.println("Account locked due to too many failed attempts.");
        }
    }
}
