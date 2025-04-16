package org.section16.multithreading;

public class CreatingThreadTypes {

    public static void m1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Code reuse by 'method reference' arg must same");
        }
    }

    public static void main(String[] args) {
        //using Ruubanle labda expression thread creation
        Runnable r1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("using Lamda EXP" + i);
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        //using the Method reference thread creation it's calling method m1 static method
        Runnable r2 = CreatingThreadTypes::m1;
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
