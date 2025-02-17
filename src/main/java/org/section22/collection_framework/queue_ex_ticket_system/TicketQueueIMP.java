package org.section22.collection_framework.queue_ex_ticket_system;

import java.util.LinkedList;
import java.util.Queue;

public class TicketQueueIMP {

  /*  private Queue<Ticket> ticketQueue;

    public TicketQueueIMP() {
        ticketQueue = new LinkedList<>();
    }*/
Queue<Ticket> tq = new LinkedList<>();
    // 1. Add a ticket using add() (Throws exception if full)
    public void addTicketStrict(Ticket ticket) {
        try{
            tq.add(ticket);
            System.out.println("Queue added :"+ticket);

        } catch (IllegalStateException e) {
            System.out.println("Queue is full! Cannot add ticket.");
        }
    }
    // 2. Add a ticket using offer() (Returns false if full)
    public void addTicket(Ticket ticket) {
        boolean added= tq.offer(ticket);
       if(added) {
            System.out.println("Ticket added: " + ticket);
        } else {
            System.out.println("Queue is full! Cannot add ticket.");
        }
    }
    // 3. Remove a ticket using remove() (Throws exception if empty)
    public void processTicketStrict(){
        try {
            Ticket removedTicket = tq.remove();
            System.out.println("Processing ticket (Strict): " + removedTicket);
        } catch (Exception e) {
            System.out.println("No tickets to process!");
        }
    }
    // 4. Remove a ticket using poll() (Returns null if empty)
    public void processTicket() {
        Ticket removeTq= tq.poll();
        if(removeTq != null){
            System.out.println("Processing ticket: " + removeTq);
        }
        else {
            System.out.println("No tickets to process!");
        }
    }
    // 5. View the next ticket using element() (Throws exception if empty)
    public void viewNextTicket(){
        try{
            System.out.println("next ticket "+tq.element());
        }catch (Exception e){
            System.out.println(" no tickets in the queue");
        }
    }
    // 6. View the next ticket using peek() (Returns null if empty)
    public void viewNextTicket2() {
        Ticket nextTicket = tq.peek();
        if (nextTicket != null) {
            System.out.println("Next ticket: " + nextTicket);
        } else {
            System.out.println("No tickets in the queue!");
        }
    }
    // 7. Display all tickets
    public void displayQueue() {
        System.out.println("Current Ticket Queue: " + tq);
    }


}


