package org.section29.java_8.lamda;

interface Interf{
    public void sumI(int a,int b);
}
public class lambdaintrobasic {
    public static void main(String[] args) {
        Interf i= (a,b)-> System.out.println(a+b);
        i.sumI(10,7);

       // SqureR r= r.sq(i)-> i*i;
    }
}
interface SqureR{
    public  void sq(int a);
}
