package org.section16.multithreading;

class MyThreadExt extends Thread {
    public MyThreadExt(String name) {
        //to call superclass we use keyword super
        super(name);// this is way to pass name to superclass constructor
    }

    @Override
    public void run() {
        System.out.println(" :- running by the My thread class using extend Thread class");
        setPriority(Thread.MIN_PRIORITY + 2);
    }
}

class MyThreadImpl implements Runnable {

    @Override
    public void run() {
int count=1;

        while (true){
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class T2_ThreadMethods {
    public static void main(String[] args) {
        System.out.println("  Thread call Using Thread Class");
        MyThreadExt ext = new MyThreadExt("threadParameter");
        ext.start();
        // using methods in object
        long id1 = ext.getId();
        System.out.println("id is :" + id1);
        System.out.println(" name :" + ext.getName() +
                " priority: " + ext.getPriority() +
                " status: " + ext.getState() +
                " threadId :" + ext.threadId() +
                "is alive : " + ext.isAlive());
        ext.setPriority(Thread.MIN_PRIORITY + 5); //set priority
        System.out.println(" now priority is : " + ext.getPriority());

        System.out.println(" Thread class using impl class");
        Thread th = new Thread(new MyThreadImpl(), "Ram"); // passing MyThreadImpl as constructor parameter , there it is anonymous class
        th.start();
        long id = th.getId();
        System.out.println(" id is : " + id);
        System.out.println(" name : " + th.getName() +
                " priority: " + th.getPriority() +
                " threadId : " + th.threadId() +
                " stsatus : " + th.getState() +
                " alive :" + th.isAlive());
        // interuption
//        th.interrupt(); // this cause exception and

    }

}
