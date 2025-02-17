package org.section22.collection_framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Basic {
    public static void main(String[] args) {
        System.out.println("The Set Interface in Java is a part of the Collections Framework, residing in the java.util package. It is designed to store a collection of unique elements, meaning duplicate values are not allowed.  ");
        System.out.println("Key Characteristics of Set\n" +
                "Unique Elements: It doesn’t allow duplicate elements.\n" +
                "No Guaranteed Order: Unlike lists, the order of elements in a Set is not guaranteed.\n" +
                "Implements Collection Interface: Set is a subinterface of the Collection interface.");
        System.out.println("Common Set Implementations\n" +
                "HashSet\n" +
                "LinkedHashSet\n" +
                "TreeSet");

        System.out.println("======================Treeset ==============:\n" +
                "1.Internal Working: Uses a Red-Black Tree (a balanced binary search tree) internally.\n" +
                "2.Order: Elements are sorted in their natural order or according to a specified comparator.\n" +
                "3.Performance: Slower than HashSet and LinkedHashSet for basic operations but provides sorting functionality.\n" +
                "4.Use Case: When you need sorted unique elements.");
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(5);
        set.add(15);
        set.add(10);  // Duplicate, won't be added

        System.out.println(set);  // Output: [5, 10, 15] (Sorted order)


        System.out.println("=====================HastSet\n" +
                "Internal Working: Uses a HashMap internally for storing elements. The elements are stored as keys in the HashMap with dummy values.\n" +
                "Order: No guarantee of order.\n" +
                "Performance: Provides constant time for basic operations (add, remove, contains) if the hash function is good.\n" +
                "Use Case: When you need a collection of unique elements and order doesn’t matter.");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Apple");
        set2.add("Banana");
        set2.add("Apple");  // Duplicate, won't be added
        set2.add("Cherry");

        System.out.println(set2);

        System.out.println("=====================LinkedHashSet\n" +
                "Internal Working: Maintains a linked list of the entries in the set, preserving the insertion order.\n" +
                "Order: Maintains the order in which elements are inserted.\n" +
                "Performance: Slightly slower than HashSet due to the overhead of maintaining the insertion order.\n" +
                "Use Case: When you need uniqueness but also want elements in insertion order.");


        LinkedHashSet<String> set3 = new LinkedHashSet<>();
        set3.add("Apple");
        set3.add("Banana");
        set3.add("Cherry");
        set3.add("Apple");  // Duplicate, won't be added

        System.out.println(set3);


        System.out.println("========================Visual Analogy:\n" +
                "Think of a Set as a basket of unique fruits:\n" +
                "\n" +
                "HashSet: Fruits are thrown randomly into the basket.\n" +
                "LinkedHashSet: Fruits are arranged in the order they are added.\n" +
                "TreeSet: Fruits are sorted by their size or name.");


        System.out.println("Set Comparison Table\n");
// Features
        String[] features = {
                "Order",
                "Null Allowed",
                "Performance",
                "Sorting"
        };
        // Set Types
        String[] setTypes = {
                "HashSet",
                "LinkedHashSet",
                "TreeSet"
        };

        // Set behaviors
        String[][] setBehaviors = {
                {"Unordered", "Insertion Order", "Sorted Order"},
                {"Yes (only one)", "Yes (only one)", "No"},
                {"Fastest", "Moderate", "Slowest"},
                {"No", "No", "Yes"}
        };
        // Printing the table
        printTable(features, setTypes, setBehaviors);
    }
    private static void printTable(String[] features, String[] setTypes, String[][] setBehaviors) {
        // Printing header (Set Types)
        System.out.print("Feature            ");
        for (String setType : setTypes) {
            System.out.printf("%-20s", setType);
        }
        System.out.println();

        // Printing the table rows (Features)
        for (int i = 0; i < features.length; i++) {
            System.out.printf("%-20s", features[i]);  // Feature column
            for (int j = 0; j < setTypes.length; j++) {
                System.out.printf("%-20s", setBehaviors[i][j]);  // Behavior for each Set
            }
            System.out.println();
        }
    }
}
