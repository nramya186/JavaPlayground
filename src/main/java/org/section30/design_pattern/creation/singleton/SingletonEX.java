package org.section30.design_pattern.creation.singleton;

public class SingletonEX {
    private static SingletonEX instance;
    private SingletonEX(){
        System.out.println("private constructor ");
    }
    public static SingletonEX getInstance(){
        if(instance==null){
            instance = new SingletonEX();
        } return instance;
    }
 public  void message1(String msg){
     System.out.println("message "+msg);
 }

    public static void main(String[] args) {
        SingletonEX singleton1= SingletonEX.getInstance();
        SingletonEX singleton2= SingletonEX.getInstance();
            singleton1.message1("instance 1");
            singleton2.message1("instance 2");
        System.out.println(singleton1==singleton2);
    }
}
