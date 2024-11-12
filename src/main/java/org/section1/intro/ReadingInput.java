package org.section1.intro;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scanner is class which will be in util package, to use scanner class have to create object");
        System.out.println("enter  nextInt method a value : ");
        int a= sc.nextInt();
        System.out.println("a value is "+ a);

        System.out.println("inter radex integer value of f:");
        int f= sc.nextInt();
        System.out.println(" f value :"+f);


        System.out.println("for sting we have next() which will take only one word , for more than one words we have nextLine method");
        System.out.println("enter the single word for next method s:");
        String s= sc.next();
        System.out.println("enter the more word for next method ss:");
        String ss= sc.nextLine();

        System.out.println(" single word and more word s: "+ s+" ; ss :"+ss);



    }
}
/*
Write a Java program that continuously takes user input of various data types (e.g., int, double, float, string, long, byte, short, BigInteger, BigDecimal, and boolean) using the Scanner class. The program should do the following:

Prompt the user to enter the type of input they want to read (e.g., "int" for integer, "double" for a double-precision number).
Based on the user’s input type, prompt them to enter a corresponding value
*/


class DynamicScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Enter the type of input you want to read (e.g., int, double, float, string, long, byte, short, BigInteger, BigDecimal, boolean). Type 'exit' to quit.");

        while (true) {
            System.out.print("Enter type: ");
            command = scanner.nextLine().toLowerCase();

            if (command.equals("exit")) {
                System.out.println("Exiting...");
                break;
            }

            try {
                switch (command) {
                    case "int":
                        System.out.print("Enter an integer: ");
                        int intValue = scanner.nextInt();
                        System.out.println("You entered integer: " + intValue);
                        scanner.nextLine();  // Consume the newline
                        break;

                    case "double":
                        System.out.print("Enter a double: ");
                        double doubleValue = scanner.nextDouble();
                        System.out.println("You entered double: " + doubleValue);
                        scanner.nextLine();  // Consume the newline
                        break;

                    case "float":
                        System.out.print("Enter a float: ");
                        float floatValue = scanner.nextFloat();
                        System.out.println("You entered float: " + floatValue);
                        scanner.nextLine();  // Consume the newline
                        break;

                    case "long":
                        System.out.print("Enter a long: ");
                        long longValue = scanner.nextLong();
                        System.out.println("You entered long: " + longValue);
                        scanner.nextLine();  // Consume the newline
                        break;

                    case "short":
                        System.out.print("Enter a short: ");
                        short shortValue = scanner.nextShort();
                        System.out.println("You entered short: " + shortValue);
                        scanner.nextLine();  // Consume the newline
                        break;

                    case "byte":
                        System.out.print("Enter a byte: ");
                        byte byteValue = scanner.nextByte();
                        System.out.println("You entered byte: " + byteValue);
                        scanner.nextLine();  // Consume the newline
                        break;

                    case "biginteger":
                        System.out.print("Enter a BigInteger: ");
                        BigInteger bigIntegerValue = scanner.nextBigInteger();
                        System.out.println("You entered BigInteger: " + bigIntegerValue);
                        scanner.nextLine();  // Consume the newline
                        break;

                    case "bigdecimal":
                        System.out.print("Enter a BigDecimal: ");
                        BigDecimal bigDecimalValue = scanner.nextBigDecimal();
                        System.out.println("You entered BigDecimal: " + bigDecimalValue);
                        scanner.nextLine();  // Consume the newline
                        break;

                    case "string":
                        System.out.print("Enter a string: ");
                        String stringValue = scanner.nextLine();
                        System.out.println("You entered string: " + stringValue);
                        break;

                    case "boolean":
                        System.out.print("Enter a boolean: ");
                        boolean booleanValue = scanner.nextBoolean();
                        System.out.println("You entered boolean: " + booleanValue);
                        scanner.nextLine();  // Consume the newline
                        break;

                    default:
                        System.out.println("Unsupported type. Try one of the supported types listed above.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input for type '" + command + "'. Try again.");
                scanner.nextLine();  // Clear the invalid input
            }
        }

        scanner.close();
    }
}
