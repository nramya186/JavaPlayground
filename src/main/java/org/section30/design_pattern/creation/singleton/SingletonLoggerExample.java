package org.section30.design_pattern.creation.singleton;

public class SingletonLoggerExample {
    public static void main(String[] args) {
        Loggers l1 = Loggers.getInstance();
        l1.log("Application Started");
        Loggers l2 = Loggers.getInstance();
        l2.log("user logged in ");
        System.out.println(l1 == l2);
        // Output: true (Both are the same instance)
    }
}

class Loggers {
    // 1. Static instance variable
    private static Loggers instance;

    // 2. Private constructor to prevent multiple instances
    private Loggers() {
        System.out.println("Instance created ");
    }

    //public access instance from method getInstance
    public static Loggers getInstance() {
        if (instance == null) {
            instance = new Loggers();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG]:" + message);
    }
}


