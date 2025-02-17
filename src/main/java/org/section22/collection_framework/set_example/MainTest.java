package org.section22.collection_framework.set_example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SetExample setExample = new SetExample();

        System.out.println(" Choose an Option to test set Implementation");
        System.out.println(" 1. Hashset (unordered)\n" +
                "2. LinkedHashSet(Insertion Order)\n" +
                "3. TeeSet (sorted order)");
        System.out.println(" enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                setExample.demonStrateSet(new HashSet<>(), "HashSet");
                break;
            case 2:
                setExample.demonStrateSet(new LinkedHashSet<>(), "LinkedHshSet");
                break;
            case 3:
                setExample.demonStrateSet(new TreeSet<>(), "TreeSet");
                break;
            default:
                System.out.println("Invalid output");
        }
        sc.close();


    }
}
