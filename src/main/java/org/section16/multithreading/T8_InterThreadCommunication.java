package org.section16.multithreading;

class Mydatas{
    int value;
    boolean flag= true;
    //write
   synchronized public void set(int v){
       while (flag!=true)
          try{ wait();}catch (InterruptedException e){}
       value=v;
       flag=false;
       notify();
    }
    //read
   synchronized public int get(){
        int x=0;
       while (flag!=false)
           try{ wait();}catch (InterruptedException e){}
        x=value;
       flag=true;
       notify();
        return x;
    }
}

class Producer extends Thread{
    Mydatas data;
    public  Producer(Mydatas data){
        this.data=data;
    }
    public void run(){
        int count =1;
        while (true){
            data.set(count);
            System.out.println(" Producer "+count);
            count++;
        }
    }
}

//consumer
class Consumer extends Thread{
    Mydatas data;

    public  Consumer(Mydatas data){
        this.data=data;
    }
    public void run(){
        int value;
        while (true){
           value= data.get();
            System.out.println("Consumer "+value);        }
    }
}
public class T8_InterThreadCommunication {
    public static void main(String[] args) {
        System.out.println("Producer and Consumer");

        Mydatas d= new Mydatas();
        Producer p= new Producer(d);
        Consumer c = new Consumer(d);
        p.start();
        c.start();
    }
}
