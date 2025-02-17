package org.section21.generics;

import java.security.PublicKey;

//generic class which can hold any type of data  . one data member , and get and set method ,
//T is template ,this is for object can store any type pf data

class Data<T> {    // This cxlass is capable of storing one object but can store any data
    //  T data = new T(); we cant type so we need to typecast it to object class which is parent class
    private T obj;

    public void setData(T v) { //taking T template and v value
     obj =v;
    }

    public T getData(){
      return obj;  //to read data and return type is T
    }
}

// array  which have append and display method initial length is 0
@SuppressWarnings("unchecked")   // as we using the unsafe generic line 24 myarray class // as we converting object into generic
class Myarray<T>{
    T A[] = (T[]) new Object[10];
  int length =0;

  public void append(T v){
   A[length++]=v;
  }

  public  void display(){
      for( int i=0; i<length ;i++){   // can use for( T x: A) but as we fixed size in Object 10 so it will give error if we not insert 10 element
          System.out.println(A[i]);
      }
  }
}
public class BasicGenerics {
  public static void main(String[] args) {
    //create object of the class Data
    Data<Integer> d = new Data<>();  // we can write new Data<Integer> (); also
    //if want to store string we can change Integer by string // jst we have to give it as parameter
    d.setData(10);   // here autoboxing is happening else we have to write d.setData(new Integer(20));
    System.out.println("Get Data : "+ d.getData());


      System.out.println(" Calling array of object :");
      Myarray<String> ma = new Myarray<>();
      ma.append("Hi");
      ma.append("Hello");
      ma.append("Ramya");
      ma.append("vinay");

      ma.display();

  }
}
