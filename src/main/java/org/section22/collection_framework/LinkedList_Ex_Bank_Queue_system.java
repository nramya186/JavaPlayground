package org.section22.collection_framework;

import java.util.LinkedList;

//queue of customers in a bank. In this example, we'll create a custom class
class Customer{
    private int custId;
    private String name;
    private String accountType;

    public Customer(int custId,String name,String accountType){
        this.custId = custId;
        this.name=name;
        this.accountType=accountType;
    }

    public int custId() {
        return custId;
    }

    public Customer setCustId(int custId) {
        this.custId = custId;
        return this;
    }

    public String name() {
        return name;
    }

    public String accountType() {
        return accountType;
    }

    public Customer setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }
@Override
    public String toString(){
        return "CustomerID: " + custId + ", Name: " + name + ", Account Type: " + accountType;
    }
}


public class LinkedList_Ex_Bank_Queue_system {

    public static void main(String[] args) {
        // LinkedList to manage the queue of customers
        LinkedList<Customer> c = new LinkedList<>();

        // Adding customers to the queue
        c.add(new Customer(101 ,"Ramesh", "saving"));
        c.add(new Customer(102 ,"Ram", "current"));
        c.add(new Customer(103 ,"Ramya", "fixed Deposit"));
        c.add(new Customer(104 ,"Ramala", "saving"));
        c.add(new Customer(105 ,"amesh", "current"));

        System.out.println("Initial queue:"+c);
        //calling utility method to print
        printQueue(c);


        // Serving the first customer
        Customer serveCustomer = c.removeFirst();
        System.out.println("After served customer:"+serveCustomer);

        // Printing the queue after serving one customer

        System.out.println("After serving , queue: "+c);


        // Adding a new customer at the end

         c.addLast(new Customer(107, "Vinya","Saving"));
        System.out.println("\nQueue after adding new customer" +c );
        printQueue(c);

        // Adding a priority customer to the front of the queue
        c.addFirst(new Customer(108, "Vinita","Current"));
        System.out.println("\nQueue After Adding Priority Customer:");
        printQueue(c);



    }
    // Utility method to print the queue
public static void printQueue(LinkedList<Customer> que){
        for(Customer c :que){
            System.out.println(c);
        }
}
}
