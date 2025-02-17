package org.section22.collection_framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collection_Methods {
    private static final Logger log= LoggerFactory.getLogger(CollectionsBasics.class);
    public static void main(String[] args) {
        System.out.println("collection methods ");

        // Step 1: Create a Collection of strings
        Collection< String > players = new ArrayList<>();

        // Step 2: Add elements to the collection
        players.add("Virat Kolhi");
        players.add("Rohit");

        log.info(" Initial Collection players: "+players);


        Collection<String>  newPlayer= Arrays.asList("MS Dhoni"," Sachin Tendulkar","jadeja","kl rahul","Hartik Pndya","Rishbh Pant");

        //method 1: add all
        players.addAll(newPlayer);
        System.out.println(players);

        // Step 3: Check if an element exists
        System.out.println(" Contaions Rohit: "+ players.contains("Rohit"));
        System.out.println(" Contaions Dhoni: "+ players.contains("MS Dhoni"));
        // Step 4: Get the size of the collection
        System.out.println("size of collection player "+players.size());
        // Step 5: Remove an element
        players.remove("kl rahul");
        System.out.println("after remove object kl rahul  players :"+players);

        // Step 6: Add all elements from another collection
//         newPlayer.add("Hartik Pndya");
//         newPlayer.add("Rishbh Pant");
//         players.addAll(newPlayer);
        System.out.println("After adding new Players:"+players);

        // Step 7: Check if the collection is empty
        System.out.println("is it emplty players? " +players.isEmpty());

        // Step 8: Convert to an array
Object[] plyersArray = players.toArray();
        System.out.println("Array Represtentaion:");
        for(Object plArray : plyersArray){
            System.out.println(plArray);
        }
        System.out.println();

        // Step 9: Retain only specified elements
Collection<String> retainList = new ArrayList<>();
retainList.add("Virat Kolhi");
retainList.add("Rohit");
players.retainAll(retainList);
        System.out.println("After retain specific player"+players);

        players.add("Ramya");
        // Step 10: Remove all elements in another collection
players.removeAll(retainList);
        System.out.println("After Removing Retained Players: " + players);

        // Step 11: Clear the collection
        players.clear();
        System.out.println("After Clearing Collection: " + players);
        // Step 12: Check if empty after clearing
        System.out.println("Is collection empty (after clear)?"+players.isEmpty());


        players.addAll(newPlayer);
        System.out.println("Before removeIf: " + players);
        players.removeIf(p -> p.startsWith("R"));

        System.out.println("after remove if start with R"+players );
        players.removeIf(p2->p2.contains("a"));
        System.out.println("after remove if  contains a"+players );

        System.out.println(" \n ");

        log.info(" common scenarios for using collections ");
        log.info(" \n \n" +
                "Scenario\t                    Collection to Use                                   \tReason\n" +
                "Dynamic resizing            \tArrayList, LinkedList                               \tAllows dynamic resizing without worrying about fixed sizes as in arrays.\n" +
                "Unique elements            \tHashSet, TreeSet, LinkedHashSet                      \tEnsures no duplicate elements in the collection.\n" +
                "Key-Value pairs            \tHashMap, TreeMap, LinkedHashMap                      \tUsed when each value must be associated with a unique key.\n" +
                "Order of insertion         \tLinkedList, ArrayList, LinkedHashSet                 \tMaintains the insertion order of elements.\n" +
                "Fast lookups and searches  \tHashSet, HashMap                                     \tProvides O(1) time complexity for lookups and searches.\n" +
                "Sorted order                \tTreeSet, TreeMap                                    \tAutomatically maintains elements in sorted order.\n" +
                "FIFO (Queue)                \tQueue, PriorityQueue, Deque                         \tEnsures first-in-first-out order.\n" +
                "LIFO (Stack)                 \tDeque                                              \tDouble-ended queue can be used as a stack.\n" +
                "Thread-safe collections      \tConcurrentHashMap, CopyOnWriteArrayList, Collections.synchronizedList()   \tEnsures thread safety when collections are accessed by multiple threads concurrently.\n" +
                "Random access                  \tArrayList                                         \tProvides constant-time access to elements by index.\n" +
                "Frequent insertions/deletions at ends   \tLinkedList                                   \tEfficient for adding/removing elements at the start or end.\n" +
                "Frequent insertions in the middle    \tLinkedList                                      \tPerforms better than ArrayList for insertions in the middle due to its node-based structure.");


    }
}
