package org.section9.class_object;

class Product {
    private String itemno;
    private String name;
    private double price;
    private int qty;

    public Product(String i) {
        itemno = i;
    }

    public Product(String i, String n) {
        itemno = i;
        name = n;
    }

    public Product(String i, String n, double p, int q) {
        itemno = i;
        name = n;
        price = p;
        qty = q;
    }

    public String getitemno() {
        return itemno;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    //no need of set item number ,and no set name

    public void setPrice() {
        System.out.println(price);
    }

    public void setQty() {
        System.out.println(qty);
    }


    public void itemdetails() {
        System.out.println();
    }

}

class Customer {

    private String custid, name, address, phoneno;

    //getter
    public String getCustId() {
        return custid;
    }

    public String getCName() {
        return name;
    }

    public String getCAddress() {
        return address;
    }

    public String getphno() {
        return phoneno;
    }

    //setter
    public void setAddress() {
        System.out.println(address);
    }

    public void setPhoneno() {
        System.out.println(phoneno);
    }

    //constructor
    public Customer(String custid, String name, String address, String phoneno) {
        this.custid = custid;
        this.name = name;
        this.address = address;
        this.phoneno = phoneno;
    }

}

public class C3_Constructor_3Product_Customer {
    public static void main(String[] args) {
        Product p = new Product("1", "coffee", 100, 3);
        Customer c= new Customer("4","ramya","Bangalore","789546728");
        System.out.println("id: "+p.getitemno()+"item name:"+p.getName()+"price:"+p.getPrice()+p.getQty());
        System.out.println("cust id: "+c.getCustId()+"c name:"+c.getCName()+"address:"+c.getCAddress()+"phone number:"+c.getphno());

    }
}
