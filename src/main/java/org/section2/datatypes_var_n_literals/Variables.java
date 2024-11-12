package org.section2.datatypes_var_n_literals;

public class Variables {
    // Variable is used to stores the value
    //variable which holds the data that can be changed during the execution of program

    //Types : Local Variable ,Instance Variable ,static variable
   //1.Local Variable declared inside the method, constructor or block
    public static void localVariable(){
        //declaration & initialization
        int a= 10; //local variable is a
        //utilization
        System.out.println(" variable a value : "+ a); // sout+tab
    }

    //2.Instance variable : variable declared inside class but outside method
    //it can access by the all method of the class , each instances (object ) of the class has it's own copy
    String name;

    Variables v= new Variables();

    public void method2(){
        String name1 = v.name;  //creating instance variable v and access varible which is ouside method
        System.out.println("R method2");
        name = "ramya";  // instance variable
        System.out.println("instance variable :"+name);
    }

    //3 Static variable : variable declared with static keyword
    //it shared among all the instance of the class

    public static String companyName ="TCS";
    public static void main(String args[]){   //pvsm +tab short cut key
         localVariable();
        System.out.println("static key word:" + companyName);
        Variables v1 = new Variables();
        v1.method2();

    }


    //Variables-Naming Rules -----
    //  1. Case sensitive
    //  2. Contains alphabets,num,_ or $
    //  3. start with alphabet or _ or $
    //  4. should not be keyword,class name, if class is also in use
    //  5. no limit no lenght of name
    // 6. follow camel cases


    //two vaiable not have same name
}
