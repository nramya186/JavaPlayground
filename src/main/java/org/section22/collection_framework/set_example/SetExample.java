package org.section22.collection_framework.set_example;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetExample {

    //Method to add to set and display
    public void demonStrateSet(Set<String> set,String setType ){
        System.out.println("\nUsing "+ setType +" :");

        System.out.println(" Adding elements ...\n" +
                "Duplicates entries won't be added.\n" +
                "Enter 'STOP' to finish adding elements.\n");
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("Enter element:");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("STOP")) break;

            boolean isAdded = set.add(input);
            System.out.println(isAdded ? " added successfully ": "Duplicated not allowed.");
        }

        System.out.println("\n Initial "+setType + "contains :"+set +" \n");



        System.out.println(" enter option below : \n" +
                "1. To check element presence \n " +
                "2. To Remove element\n" +
                "3. To get size of "+ setType+"\n" +
                "4. Iterate through set\n" +
                "5 clear set \n " +
                "Enter Option :");

      //  System.out.println("\nIs the set empty? " + set.isEmpty());
        int option = sc.nextInt(); // reading int
        sc.nextLine();// left over space or newline
        // If the set is NOT empty
        if(!set.isEmpty()) {
            System.out.println("\nThe set is not empty. Proceeding with the selected operation...");

            switch (option) {
                case 1:
                    // check if set contains an element
                    System.out.println(" \n enter element to check if it exist:");
                    String elementCheck = sc.nextLine();
                    System.out.println("Contains " + elementCheck + set.contains(elementCheck));
                    break;
                case 2:
                    // remove element
                    System.out.println(" Enter element to remove :");
                    String elementRemove = sc.nextLine();
                    System.out.println(" element" + elementRemove + "removed");
                    break;
                case 3:
                    // get size
                    System.out.println("Size of" + setType + " is : " + set.size());
                    break;
                case 4:
                    // Iterate through the set
                    System.out.println("\nIterating through the set:");
                    Iterator<String> iterator = set.iterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case 5:
                    System.out.println("Do you want to clear the" + setType + " set Y/N ?:");
                    String yn = sc.nextLine();
                    if (yn == "Y") {
                        set.clear();
                        System.out.println(" set Cleared ");
                    } else {
                        System.out.println(setType + " set not cleared.");
                    }
                    break;

                default:
                    System.out.println(" Invalid Input ");


            }
        }else { // Notify that the set is empty
            System.out.println("\nThe set is empty. No operations can be performed.");
        }
    }
}
