package org.section16.multithreading;
class Mydata{
    //without sync
    public void disaply(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
    //with sync block it's critical section
    public void disaply2(String str) throws InterruptedException {
        synchronized (this){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
            Thread.sleep(100);
        }}
    }
    //with sunc method
   synchronized public void disaply3(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
}
//thread 1
class MyThread1 extends Thread{
    Mydata d;
    //constructor
    public MyThread1(Mydata d){
        this.d=d;
    }
    public void run(){
        d.disaply("Hello Word");
        try {
            d.disaply2(" T1 Sync Block");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        d.disaply3(" T1.Sync Method");
    }
}

//thread 2
class MyThread2 extends Thread{
    Mydata d;
    //constructor
    public MyThread2(Mydata d){
        this.d=d;
    }
    public void run(){
        d.disaply("Wellcome All");
        System.out.println(" ");
        try {
            d.disaply2("  T2 Sync Block");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" ");
        d.disaply3("  T2.Sync Method");

    }
}
public class T6_SyncDemo {
    public static void main(String[] args) {
        Mydata d =new Mydata();
        MyThread1 t1=new MyThread1(d);
        MyThread2 t2=new MyThread2(d);
   t1.start();
   t2.start();
   //both 2ill call same method print letter ny letter
    }
}
