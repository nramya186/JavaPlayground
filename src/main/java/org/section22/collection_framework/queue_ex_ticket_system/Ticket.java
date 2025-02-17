package org.section22.collection_framework.queue_ex_ticket_system;

public class Ticket {
    private static int ticketCounter = 1; // Auto-incrementing counter

    private int id;
    private String description;
    private int priority;// 1 = High, 2 = Medium, 3 = Low

    public Ticket(String description,int priority){
        this.id=ticketCounter++; // Assigns the current value and increments for next
        this.description=description;
        this.priority=priority;
    }

    public int getId() {
        return id;
    }


    public String getDescription() {
        return description;
    }

    public Ticket setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getPriority() {
        return priority;
    }

    public Ticket setPriority(int priority) {
        this.priority = priority;
        return this;
    }
    @Override
    public String toString(){
        return "Ticket{id=" + id + ", description='" + description + "', priority=" + priority + "}";
    }
}



/*🔹 How It Works
static int ticketCounter = 1;

This is a class-level variable shared among all Ticket objects.
It starts at 1 and increases automatically.
this.id = ticketCounter++;

Assigns the current counter value to the id.
Increments ticketCounter for the next ticket.*/
