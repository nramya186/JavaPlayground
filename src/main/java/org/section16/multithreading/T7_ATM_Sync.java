package org.section16.multithreading;
class ATM{
   synchronized public void checkBallance(String name) throws InterruptedException {
        System.out.println( name+ " checking ballence");
        Thread.sleep(10);
    }
   synchronized public  void withDraw(String name,int amt) throws InterruptedException {
        System.out.println(name +" withdrow " + amt);
        Thread.sleep(10);
    }
}

//thread classs
class Customer extends Thread {
    String name;
    int amount;
    ATM atm;

    public Customer(String name, ATM a, int amt) {
        this.name = name;
        this.atm = a;
        this.amount = amt;

    }

    public void useAtm() {
        try {
            atm.checkBallance(name);
            atm.withDraw(name, amount);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void run() {
        useAtm();
    }
}
public class T7_ATM_Sync {

    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 =new Customer("ramya",atm,100);
        Customer c2= new Customer("rmy",atm, 600);
        c1.start();
        c2.start();
    }
}

