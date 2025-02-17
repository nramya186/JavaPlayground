package org.section16.multithreading;
class MyThread extends Thread{
    public void run(){
        int count =1;
        while (count <= 1500) {//infinite loop
            System.out.println(count++ +" My Thread");
           /* try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }
}
public class T3_DemonThreadJionYield {
    public static void main(String[] args) throws InterruptedException {
        Thread th = new MyThread(); // main thread
/*
        th.setDaemon(true); // seting demon thread // when main thread terminate demon also end
*/
        th.start();
//        try {Thread.sleep(100); } catch (Exception e){}

        // join : means it should wait till othere to finish\

        // making Main method to join with other thread even if demon thread it should join
        // by using join
        /*Thread mainThread = Thread.currentThread();// reference of current thread
        mainThread.join();// it will join any thread with is running it will join any thread
*/
        //yield

        int cnt =1;
        while (cnt <=1500){
            System.out.println("main Thread : "+cnt++);
            Thread.yield(); // it will allow other to execution // more time to other thread
        }
        
    }
}
