package org.section16.multithreading;

import org.section22.collection_framework.student_set.Student;

class WhiteBoard {
    String text;
    int noOfStudent = 0;
    int count = 0; // how many student attended

    public int attendence() {
        return noOfStudent++;
    }

    //set
    synchronized public void write(String notes) throws InterruptedException {
        System.out.println(" teacher is writing :" + notes);
        while (count != 0) {
            wait();
        }
        this.text = notes;
        System.out.println(" set notes :" + notes);
        count = noOfStudent;
        notifyAll();

    }

    //get
    synchronized public String read() throws InterruptedException {
        String str;

        while (count == 0) {
            wait();
        }
        str = text;
        count--;
        if (count == 0) {
            notify();
        }
        return str;

    }
}

class Teacher extends Thread {
    WhiteBoard w;

    String notes[] = {"java is lang ", "It is OOP", " It is Platform Independent", "this is notes", "end"};

    public Teacher(WhiteBoard w) {
        this.w = w;
    }

    public void run() {
        for (int i = 0; i < notes.length; i++) {
            try {
                w.write(notes[i]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Students extends Thread {
    String name;
    WhiteBoard wb;

    public Students(String name, WhiteBoard w) {
        this.name = name;
        this.wb = w;
    }

    public void run() {
        String text;
        wb.attendence();
        do {
            try {
                text = wb.read();
                System.out.println(name + " Reading " + text);
//                System.out.flush(); // order is different in sout so


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (!text.equals("end"));
    }

}

public class T8_Teacher_Student {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);

        Students s1 = new Students("1. ramya", wb);
        Students s2 = new Students("2. amya", wb);
        Students s3 = new Students("3. prabha", wb);
        Students s4 = new Students("4. pushpa", wb);

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();


    }
}
