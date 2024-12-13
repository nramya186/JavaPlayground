package org.section9.class_object;

import java.util.Scanner;

public class C2_DataHiding_2 {
    public static void main(String[] args) {
        System.out.println("     ***Data Hiding*** \n");
        System.out.println("-> Restricting direct access to the internal details(fields/variables/data) of class by making it 'private' and providing controlled access through public method like getter and setters.\n" +
                           "-> It ensures data security and maintains controls over how the data is accessed or modified.");

        System.out.println("     ---- Key Concepts: ---");
        System.out.println(" 1. Access Modifiers:" +
                "\n" +
                "* Fields are declared as private, so they are not accessible directly outside the class.\n" +
                "* This restricts access to the data and enforces encapsulation.\n" +
                "\n" +
                " 2. Getter and Setter Methods:\n" +
                "Getter methods allow controlled read access to private variables.\n" +
                "Setter methods allow controlled write access to private variables, often including validation logic.\n" +
                "\n" +
                "3. Advantages of Data Hiding:\n" +
                "Encapsulation: Keeps the implementation details hidden.\n" +
                "Data Security: Prevents unauthorized modification of fields.\n" +
                "Validation: Allows adding checks before changing a variable's value.\n" +
                "Flexibility: You can change the internal implementation without affecting external code.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit :");
        double amount = sc.nextDouble();

        Account ac = new Account();
        ac.setBalance(amount);  //calling setter
        System.out.println("Your balance is :"+ac.getBalance()); //calling getter
        //Use getters and setters to provide fine-grained control over field access.

        System.out.println("Enter the amount to withdrawal: " );
       double withdrawAmount = sc.nextDouble();
       ac.withdraw(withdrawAmount);

        System.out.println("Your balance is :"+ ac.getBalance());
    }
}

//Example:
/*
Create a class Account with a private variable balance (double).
Initialize it using a constructor, and use getter and setter methods to access and update the balance.
Implement methods for depositing and withdrawing money with appropriate validations.
*/
class Account{
    private double balance;  //fields is private

    // Getter method to access the balance
    public double getBalance(){
        return balance;
   }

   // Setter method to update the balance
    public void setBalance(double amount){
        balance +=amount;
   }

   public void withdraw(double amount){
        balance-=amount;
   }
}
