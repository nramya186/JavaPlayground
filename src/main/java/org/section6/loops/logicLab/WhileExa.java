package org.section6.loops.logicLab;

import java.util.Scanner;

public class WhileExa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "java123";
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter your password: ");
            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(correctPassword)) {
                System.out.println("Access Granted!");
                break; // Exit the loop when the password is correct
            } else {
                attempts--;
                System.out.println("Incorrect password. Attempts left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Account locked. Please try later.");
        }

    }
}
