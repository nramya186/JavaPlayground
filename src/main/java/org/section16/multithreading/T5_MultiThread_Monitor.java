package org.section16.multithreading;
/*
// witout sysn
class MyData{
    void display(String str){
        for(int i =0; i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}

//thread 1
class MyThread1 extends Thread{
    Mydata d1;//reference
    MyThread1(MyData dat){d1=dat;}
    public void rub(){
        d1.display("hello Word");
    }
}

//thread 2
class MyThread2 extends Thread{
    Mydata d2;//reference
    MyThread2(MyData dat){d2=dat;}
    public void rub(){
        d2.display("Welcome");
    }
}
//main method
class Test{
    psvm(){
        MyData d =new MyData();
        MyThread1 t1= new MyThread1(d);
        MyThread1 t2= new MyThread1(d);
          t1.start();
          t2.start();
          // by using this leters are mixed and it may display welcome and hellow word mixed
    }
}*/
// we want display to acces only one thread that means, hello word display at once and welcome other time
public class T5_MultiThread_Monitor {
    public static void main(String[] args) {
        System.out.println("make display method to be sync so write it for loop in sync block :") ;
        System.out.println( "way  1: sync block : \n"+
                " void display(String str){\n" +
                "synchronized(this) { \n"+
                "        for(int i =0; i<str.length();i++){\n" +
                "            System.out.println(str.charAt(i));\n" +
                "      }  }\n" +
                "    }\n" );
        System.out.println( "way  2: sync method  :"+
                "synchronized void display(String str){\n" +
                "        for(int i =0; i<str.length();i++){\n" +
                "            System.out.println(str.charAt(i));\n" +
                "       }\n" +
                "    }\n" );


    }
}
