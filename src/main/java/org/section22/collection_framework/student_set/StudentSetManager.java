package org.section22.collection_framework.student_set;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StudentSetManager {
    Student student;
    Scanner sc = new Scanner(System.in);

    // Method to add Student objects to the set
    public void addStudent(Set<Student> studentSet) {
        System.out.println("Enter student details (type '-1' for ID to stop):");

        while (true) {
            System.out.println(" Enter student id :");
            int id = sc.nextInt();
            if (id == -1) break;
            sc.nextLine();//to clear new line

            System.out.println(" Enter student name :");
            String name = sc.nextLine();
            System.out.println(" Enter student age :");
            int age = sc.nextInt();
            Student student1 = new Student(id, name, age);
            boolean isadd = studentSet.add(student1);
            System.out.println(isadd ? "student added successfully " : "Duplicated");

        }
    }

    // Method to display all students
    public void displayStudents(Set<Student> studentSet) {
        System.out.println(" Student details in set:");
        for (Student student1 : studentSet) {
            System.out.println(student1);
        }
    }

    public void displayStudentsType2(Set<Student> studentSet) {
        Iterator<Student> Set;

        for (Iterator<Student> it = studentSet.iterator(); it.hasNext(); ) { // hasnext check iterator have value or null if is not null write true
            it.next();// to display
        }
        // using for type 2
        for (Student i : studentSet) {
            System.out.println(i);
        }
    }

    public void displayStudentsType3(Set<Student> studentSet) {
        System.out.println(" using foreach lambda");
        studentSet.forEach(student1 -> System.out.println(student1));
        System.out.println(" using scope resolution ::");
        studentSet.forEach(System.out::println);
    }

    // Method to check if a Student with a specific ID exists
    public void checkStudent(Set<Student> studentSet) {
        Student s;

        System.out.println(" enter student id which you want to check: ");
        int i = sc.nextInt();
        boolean exist = studentSet.stream().anyMatch(student1 -> student1.getstid() == i);
        System.out.println(exist ? "Studen Id" + i + "is present in set"
                : "student with id " + i + " not present ");
    }

    // Method to remove a Student by ID
    public void removeStudent(Set<Student> studentSet) {
        System.out.println(" enter student id which you want to check: ");
        int i = sc.nextInt();
        boolean isRemoved = studentSet.removeIf(student1 -> student1.getstid() == i);
        System.out.println(isRemoved ? "Studen Id" + i + "is present in set and removed id "
                : "student with id " + i + " not present ");
    }


    // Method to get the size of the set
    public void displaySize(Set<Student> studentSet) {
        System.out.println("Total number of students: " + studentSet.size());
    }


    // Method to check if the set is empty
    public void checkIfEmpty(Set<Student> studentSet) {
        System.out.println(studentSet.isEmpty()
                ? "The set is empty."
                : "The set is not empty.");
    }

    // Method to iterate through the set
    public void iterateStudents(Set<Student> studentSet) {
        System.out.println("Iterating through the set:");
        Iterator<Student> iterator = studentSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Method to clear the set
    public void clearStudents(Set<Student> studentSet) {
        System.out.print("Do you want to clear all student details (Y/N)? ");

        String response = sc.nextLine();
        if (response.equalsIgnoreCase("Y")) {
            studentSet.clear();
            System.out.println("All student details cleared from the set.");
        } else {
            System.out.println("The set was not cleared.");
        }
    }

}
