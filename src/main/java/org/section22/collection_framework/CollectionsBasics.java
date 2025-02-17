package org.section22.collection_framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class CollectionsBasics {
    private static final Logger logger = LoggerFactory.getLogger(CollectionsBasics.class);

    public static void main(String[] args) {
        logger.warn( "Java Collections : Java Collections Framework is set a class ,Interfaces that makes it easier to store ,manipulate ,and retrieve group of objects");
        logger.info("Collection : is a object that represents a group of the objects (elements).for exm: a list of names, a set of number of a map of key -value pairs.");

        logger.debug(" uses of collections:" +
                " - store multiple elements in a single objects" +
                " -  Dynamically resize storage (unlike array)" +
                " - Perform operations like searching , sorting ,or iterating");

        logger.info( "There are main interfaces that defines frameworks:");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println(" Interface               Description                                    Example Classes");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("  List        Ordered collection, allows duplicate elements         ArrayList,LinkedList");
        System.out.println("  set         unordered collection, no duplicate elements           Hashset,LinkedHashSet,TreeSet");
        System.out.println("  Queue       Ordered collection, follows FIFO                      PriorityQueue,LinkedList ");
        System.out.println("  Map         Key-value pairs,Keys must be unique                   HashMap,LinkedHashMap,TreeMap");



        logger.info("Collection\n" +
                "├── List\n" +
                "│   ├── ArrayList\n" +
                "│   ├── LinkedList\n" +
                "│   └── Vector (Legacy)\n" +
                "├── Set\n" +
                "│   ├── HashSet\n" +
                "│   ├── LinkedHashSet\n" +
                "│   └── TreeSet\n" +
                "└── Queue\n" +
                "    ├── PriorityQueue\n" +
                "    └── LinkedList\n" +
                "Map (Not part of Collection but related)\n" +
                "├── HashMap\n" +
                "├── LinkedHashMap\n" +
                "└── TreeMap");


        logger.info("ArrayList: When order matters and duplicates are allowed.\n" +
                "LinkedList: For frequent insertions or deletions.\n" +
                "HashSet: To store unique elements quickly.\n" +
                "TreeSet: When elements need to be sorted.\n" +
                "HashMap: For key-value pairs with fast lookup.");

        logger.info("Array list example:  store order data and duplicates allowed");

        //Create Arraylist
        ArrayList<String> names = new ArrayList<>();
        //add
        names.add("Ramya");
        names.add("Amyra");
        names.add("Prabhakar");
        names.add("Naik");

        //print
        System.out.println("names: "+names +"\n");

        //access element by index
        System.out.println(" Print 1st index "+names.get(1));

        //remove elements
        names.remove(2);
        System.out.println("after remove :"+names);

        names.addFirst("addFirst()");
        System.out.println("After add first method :"+names);

        names.addLast("addLast()");
        System.out.println(" after addLast() method: "+names);

        System.out.println( "size of name arrayList:" + names.size());

        //loop throught elements
        for(String n : names){
            System.out.println("name: "+n);
        }

        System.out.println(" Collection Comparison Table");
        // Table Header
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                "Feature", "ArrayList", "LinkedList", "HashSet", "TreeSet", "HashMap", "TreeMap");
        System.out.println("=".repeat(150));

        // Table Rows
        printRow("Duplicates allowed?", "Yes", "Yes", "No", "No", "Keys: No, Values: Yes", "Keys: No, Values: Yes");
        printRow("Order maintained?", "Yes", "Yes", "No", "Yes (sorted)", "No", "Yes (sorted by keys)");
        printRow("Performance", "Fast random access", "Fast insertions/removals", "Fast lookups", "Slow (due to sorting)", "Fast lookups", "Slow (due to sorting)");
        printRow("Use Case", "Dynamic arrays", "Frequent insertions", "Unique items", "Sorted unique items", "Key-Value mapping", "Sorted Key-Value mapping");

    }
    // Method to print a single row with aligned columns
    public static void printRow(String feature, String arrayList, String linkedList, String hashSet, String treeSet, String hashMap, String treeMap) {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                feature, arrayList, linkedList, hashSet, treeSet, hashMap, treeMap);
    }
}
