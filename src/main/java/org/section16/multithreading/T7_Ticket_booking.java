package org.section16.multithreading;
class Ticket{
    int availableTicket =10;
    // Synchronized method to prevent overbooking

    synchronized public void bookTicket(String name,int numofTicket)
    {
        System.out.println(name +" Trying to booked "+numofTicket+" tickets");

//        for(int i =0; i<numofTicket;i)
        if(numofTicket<=availableTicket) {
            System.out.println(name +" booked "+numofTicket+" tickets");
            availableTicket -= numofTicket;

            System.out.println(" Remaining tickets :"+availableTicket);
        }else {
            System.out.println(name+" - not enogh tickets avilable ,remaining"+availableTicket);
        }

    }
}

class Customers extends  Thread{
    int ticket;
    String custname;
    Ticket t;

    public Customers(String cname,int ticketNo,Ticket t ){
        this.custname = cname;
        this.ticket=ticketNo;
        this.t =t;
    }
    public  void run(){
        t.bookTicket(custname,ticket);
    }
}
public class T7_Ticket_booking {
    public static void main(String[] args) {
        Ticket t= new Ticket();
        // Creating multiple customers (threads)
        Customers c1 =new Customers("Ramya",4,t);
        Customers c2 =new Customers("Rajani",5,t);
        Customers c3 =new Customers("Ronit",5,t);

        c1.start();
   c2.start();
   c3.start();
    }
}
