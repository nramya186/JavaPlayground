package org.section22.collection_framework.student_set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentSetTest {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Set<Student> studentSet = new HashSet<>();
        StudentSetManager manager = new StudentSetManager();


        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add students");
            System.out.println("2. Display all students");
            System.out.println("3. Check if a student exists");
            System.out.println("4. Remove a student");
            System.out.println("5. Get the total number of students");
            System.out.println("6. Check if the set is empty");
            System.out.println("7. Iterate through the set");
            System.out.println("8. Clear all student details");
            System.out.println("9 to check method loopfor loop");
            System.out.println("10. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    manager.addStudent(studentSet);
                    break;
                case 2:
                    manager.displayStudents(studentSet);
                    break;
                case 3:
                    manager.checkStudent(studentSet);
                    break;
                case 4:
                    manager.removeStudent(studentSet);
                    break;
                case 5:
                    manager.displaySize(studentSet);
                    break;
                case 6:
                    manager.checkIfEmpty(studentSet);
                    break;
                case 7:
                    manager.iterateStudents(studentSet);
                    break;
                case 8:
                    manager.clearStudents(studentSet);
                    break;
                case 9:
                    manager.displayStudentsType2(studentSet);
                    manager.displayStudentsType3(studentSet);
                    break;
                case 10:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");

            }
        }
    }
}
