package org.section22.collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListBasic {
    public static void main(String[] args) {
        System.out.println("When to Use Specific Collection Types\n" +
                "1. List (Ordered Collection with Duplicates)\n" +
                "Use when:\n" +
                "You need to preserve insertion order.\n" +
                "You may have duplicate elements.\n" +
                "Random access is important (ArrayList).\n" +
                "Frequent insertions and deletions are required (LinkedList).\n" +
                "Examples: Dynamic arrays, maintaining user inputs, implementing stacks.");


        System.out.println(" ***** List ****");
        System.out.println("The List is Interface in java ,is a part of the Java Collection Framework.");

        System.out.println(" Order is maintained , Duplication is allowed,Index -based access");
        System.out.println("ArrayList\tResizable array implementation of List. Best for random access.\n" +
                "LinkedList\tDoubly-linked list implementation. Efficient for frequent insertions and deletions.\n" +
                "Vector\tSynchronized, thread-safe version of ArrayList. Not commonly used in modern development.\n" +
                "Stack\tSubclass of Vector. Implements LIFO (Last In, First Out) operations.");

        System.out.println("class: Array List");
        //creation
        ArrayList<String> ls = new ArrayList<>();

        //Adding elements
        ls.add("Ramya");
        ls.add("Rajani");
        ls.add("Ronit");
        ls.add("Pushpa");

        //accessing elements
        System.out.println(ls);
        //access by index
        System.out.println(ls.get(1));


        for(String l: ls){
            System.out.println(l);
        }
        // Replacing an element
        ls.set(0,"Prabhakar");
        System.out.println("after replacing oth index "+ ls);

        // Removing an element
ls.remove(2);
        System.out.println("after removing the  index 2"+ls);

        ls.addLast("Ramya");


        System.out.println(ls.clone());
        System.out.println(ls);


        System.out.println("class: Linked List :");

        LinkedList<String> cities = new LinkedList<>();
        cities.add("Bangalore");
        cities.add("Mysore");
        cities.add("Pune");
        cities.add("Honnavar");
        cities.add("Chennai");
        cities.addFirst("Kashmir");
        cities.addLast("Kanyakumari");

        //accessing
        System.out.println("first city inserted :"+cities.getFirst());
        System.out.println("get by city index1: "+cities.get(1));
        System.out.println("last city inserted:"+cities.getLast());

        //removing
        cities.removeFirst();
        cities.removeLast();
        System.out.println("after removing  first and last :"+cities);
    }



}
