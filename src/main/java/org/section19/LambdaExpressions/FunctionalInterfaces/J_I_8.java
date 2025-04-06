package org.section19.LambdaExpressions.FunctionalInterfaces;

import java.util.function.*;

    public class J_I_8 implements MyfcRT, MyfcLFT {
        public static void main(String[] args) {
            //Functional Interface : Interface which have single abstsct method is called as SAM, some predefined functional interface are below :
/*        1. Predicate<T>	boolean test(T t)	Takes one input and returns true or false
        2. Function<T, R>	R apply(T t)	Takes one input and returns a result
        3. Consumer<T>	void accept(T t)	Takes one input and performs an operation (no return)
        4. Supplier<T>	T get()	Takes no input and returns a result
        5. BiPredicate<T, U>	boolean test(T t, U u)	Takes two inputs and returns true or false
        6. BiFunction<T, U, R>	R apply(T t, U u)	Takes two inputs and returns a result
        7. BiConsumer<T, U>	void accept(T t, U u)	Takes two inputs and performs an operation (no return)*/

//1️⃣ Predicate<T> (Returns true/false)
            Predicate<Integer> is_even = n -> n % 2 == 0;
            System.out.println(is_even.test(10));

            //    2️⃣ Function<T, R> (Takes input, returns output)
            Function<String, Integer> stringLng = str -> str.length();
            System.out.println(stringLng.apply("ramaya"));

            //3️⃣ Consumer<T> (Consumes input, no return)
            //Used for performing operations like printing or modifying data.
            Consumer<String> printMessage = message -> System.out.println("hello" + message);
            printMessage.accept("Hi my msg");


            //4️⃣ Supplier<T> (No input, returns output)    Used to generate values.
            Supplier<Double> randomValue = () -> Math.random();
            System.out.println(randomValue.get());

            //5️⃣ BiPredicate<T, U> (Takes 2 inputs, returns true/false)
            //Used for conditional checks on two values.

            BiPredicate<String, Integer> checkLength = (str, len) -> str.length() == len;
            System.out.println(checkLength.test("Ramya", 5));
            System.out.println(checkLength.test("naik", 6));

//6️⃣ BiFunction<T, U, R> (Takes 2 inputs, returns output)
//Used for processing two values and returning a result.
            BiFunction<Integer, Integer, Integer> add_num = (a, b) -> a + b;
            System.out.println(add_num.apply(5, 10));

            //7️⃣ BiConsumer<T, U> (Consumes 2 inputs, no return)
            //Used for performing operations on two values.
            BiConsumer<String, Integer> printDetyails = (name, age) -> System.out.println(name + "is" + age);
            printDetyails.accept("ramya", 18);

            //    Custom Functional Interface
//    You can also create your own functional interface using @FunctionalInterface.
            MyFNC add = (a, b) -> a + b;
            System.out.println(add.operation(10, 89));
            //default method
            add.defaultmethod();

            Runnable r = () -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("child Thread");
                }
            };
            Thread t = new Thread(r);
            t.start();


            J_I_8 j = new J_I_8();
            j.m1();

            //Static method from interface
    /*  staticMethod() // this will give error

    J_I_8 j1= new J_I_8();
    j1.staticMethod() */  // it will give compiler error we can't call ststic method like this

            MyfcLFT.staticMethod(); // this is correct way of calling ststic method in any class

        }


 /*   @Override
    public int operation(int a, int b) {
        return 0;
    }*/

        @Override
        public int op() {
            return 0;
        }

        @Override
        public void m1() {
            MyfcRT.super.m1();
        }


    }

    @FunctionalInterface
    interface MyFNC {
        int operation(int a, int b);


        default void defaultmethod() {
            System.out.println("From MyFNC defult method");
        }
    }

    interface MyfcRT {
        int op();

        default void m1() {
            System.out.println("From right default method");
        }
    }

    interface MyfcLFT {

        //Static method inside interface : it's  used to give general utilization we declare method as static
        // but we can't call static method directly in implementation class using implementation class name ex: subclass.staticMethod()  or staticMethod()
        // always use interface name with static method to call
        public static void staticMethod() {
            System.out.println("\n static method from MyfcLFT \n");
        }

        default void m1() {
            System.out.println("From left default method");
        }
    }

