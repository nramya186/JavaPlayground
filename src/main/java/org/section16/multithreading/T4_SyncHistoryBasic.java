package org.section16.multithreading;

public class T4_SyncHistoryBasic {
    public static void main(String[] args) {
        System.out.println("synchronisation :  \n" +
                "heep is shared resource it his common for all the objects \n" +
                "  history :\n" +
                "1 critical section : is code which share shared objects \n" +
                "2 Mutual exclusion: two ore more thread not access same time , it work one after other not at time \n" +
                "3 Locking /mutex : to make ohe thread at time   , mutex is used to lock variable if oit is 1 it means some thread is using shared object\n" +
                "4 SemaPhone : it will call wait till thread using it and after use it will call notify other thread, operating system  managing this, so version  later monitor came   \n" +
                "                   Lock() -> read() -> write() -> unlock() \n" +
                " 5 Monitor : to access shared data , steps are : \n" +
                "                    sd.read() -> sd.write() \n" +
                "                    data/ resource , lock and all is there in object and thread no need to call , no operating system involve to call   \n"
        );
    }
}
