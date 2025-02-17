package org.section22.collection_framework.queue_ex_ticket_system;

import java.util.Scanner;

public class SupportSystemMainTest {
    public static void main(String[] args) {
        TicketQueueIMP ticketQueue =new TicketQueueIMP();
        Scanner sc = new Scanner(System.in);
        int ticketId = 1;


        while (true) {
            System.out.println("\nCustomer Support System:");
            System.out.println("1. Add Ticket (Strict - `add()`)");
            System.out.println("2. Add Ticket (Safe - `offer()`)");
            System.out.println("3. Process Ticket (Strict - `remove()`)");
            System.out.println("4. Process Ticket (Safe - `poll()`)");
            System.out.println("5. View Next Ticket (Strict - `element()`)");
            System.out.println("6. View Next Ticket (Safe - `peek()`)");
            System.out.println("7. Display All Tickets");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                case 2:
                    System.out.print("Enter ticket description: ");
                    String description = sc.nextLine();
                    System.out.print("Enter ticket priority (1=High, 2=Medium, 3=Low): ");
                    int priority = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    Ticket newTicket = new Ticket( description, priority);
                    if (choice == 1) {
                        ticketQueue.addTicketStrict(newTicket);
                    } else {
                        ticketQueue.addTicket(newTicket);
                    }
                    break;
                case 3:
                    ticketQueue.processTicketStrict();
                    break;
                case 4:
                    ticketQueue.processTicket();
                    break;
                case 5:
                    ticketQueue.viewNextTicket();
                    break;
                case 6:
                    ticketQueue.viewNextTicket2();
                    break;
                case 7:
                    ticketQueue.displayQueue();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

    }
}}
