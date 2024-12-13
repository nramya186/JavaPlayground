package org.section9.class_object;

public class C3_Constructor_1 {
    public static void main(String[] args) {
        System.out.println("     ******Constructor*****  ");
        System.out.println("-> A special method used to initialize object when they are created");
        System.out.println("->It has the same name as class and no return type .\n");
        System.out.println("   Key Features: ");
        System.out.println("-> Automatic Invocation: Called automatically when an object is created.\n" +
                           "-> Overloading Supported: Multiple constructor can exist in class(constructor overloading).\n" +
                           "-> Constructor can't be declared as static or final, it is used to initialize the data member(fields) of the class"+
                           "-> Types of Constructor : \n" +
                           "    * Default constructor: No arguments,provided automatically if no constructor is defined.\n" +
                           "    * Parameterized Constructor: Accepts arguments to initialize fields with specific values.");

        //default constructor call
        Person p =new Person();
        p.display();
// 0 parameter consrtuctor
        Employee e= new Employee();
        

        //calling contructor example 2
        Employee ep= new Employee("Rahul",30,500000,976785463,9);
        Employee ep2= new Employee("Ragavi",26,500000,976785465,8);
        ep.details();
        ep2.details();
    }
}

class Person{
    String name;
    //Default constructor
    Person(){
        name="unknown";
        System.out.println("Default constructor called "+name);
    }

    void display(){
        System.out.println("Name : " +name);
    }
}

//example 2

//show emp details 2 empl passing value in constructor
class Employee{
    String empName;
    int aGe;
    double saLary;
    long phoNe;
     int num;
public Employee(){
    System.out.println("Default 0 parameter ");
}

    public Employee(String empname,int age,double salary,long phone, int n){
        this.empName=empname;
        this.aGe=age;
        this.saLary=salary;
        this.phoNe=phone;
        num = n;
    }

    public void details(){
        System.out.println(" Name:"+empName);
        System.out.println(" age:"+aGe);
        System.out.println(" salary:"+saLary);
        System.out.println(" phone: "+phoNe);
    }

}
