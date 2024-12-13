package org.section9.class_object;

 class RectangleTest {
     //Properties
    private double length;
    private double breadth;

    //constructor can be public or private
     //Constructor -1
    public RectangleTest(){        //non Parameter constructor
        length =1;
        breadth =1;
    }
     //Constructor -2
     public  RectangleTest(double l,double b){
        setLength(l);
        setBreadth(b);
    }
     //Constructor -3
     public  RectangleTest(double s){
         length=breadth=s;
     }
     //getter and setter method === properties method
    public double getLength(){
        return length;
    }
    public double getBreadth(){
    return  breadth;
    }

     public void setLength(double l) {
         if (l >= 0)
             length = l;
         else
             length = 0;
     }
         public void setBreadth(double b){
             if(b>=0)
                breadth =b;
             else
                 breadth=0;
         }

    public  double area(){
        return getLength()*getBreadth();
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    //enquiry method
    public boolean isSquare(){
        if(length==breadth)
            return true;
        else
            return false;


    }



    public  void Test(){
        System.out.println(" l: and b: "+length+breadth);
    }

}
public  class C3_Constructor_2Rectangle{
    public static void main(String[] args) {
RectangleTest r= new RectangleTest(10,39);
r.Test();
        System.out.println("Area: "+r.area());

    }
}
