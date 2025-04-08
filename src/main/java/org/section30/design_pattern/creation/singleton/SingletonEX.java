package org.section30.design_pattern.creation.singleton;

public class SingletonEX {
    //1. create private static instance
    private static SingletonEX instance;
    //2. create private constructor
    private SingletonEX() {
        System.out.println("private constructor ");
    }
    //3. create public static method to get instance which return SingletonClass
    public static SingletonEX getInstance() {
        if (instance == null) {
            instance = new SingletonEX();
        }
        return instance;
    }
    public void message1(String msg) {
        System.out.println("message " + msg);
    }
    public static void main(String[] args) {
        // Get two references to the Singleton instance
        SingletonEX singleton1 = SingletonEX.getInstance();
        SingletonEX singleton2 = SingletonEX.getInstance();
        // Call message method using both references
        singleton1.message1("instance 1");
        singleton2.message1("instance 2");
        // Check if both references point to the same object
        System.out.println(singleton1 == singleton2); // should print true
    }
}
