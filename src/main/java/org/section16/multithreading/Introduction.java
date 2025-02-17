package org.section16.multithreading;

public class Introduction {
    public static void main(String[] args) {
        System.out.println(" MultiTasking : running more then one task, ex: windows" +
                "Multi-Programming : Running more than one program that is running multiple programs on a single machine or a computer is known as multi-programming.");

        System.out.println("Multi Threading : single user runs multiple tasks simultaneously"
        +" MULTI_THREADING: it is a type of multi-threading where there are different tasks going on under a single application.");

        System.out.println("To achieve Multi-Thread :  1. using Thread class(extends) 2.using Runnable interface(implements");

        System.out.println("1. claass must extend Thread class" +
                " 2. override run method " +
                "3.create object of Thread class and call the start method ");
    }
}
