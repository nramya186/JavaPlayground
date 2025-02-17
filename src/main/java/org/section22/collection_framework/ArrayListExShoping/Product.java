package org.section22.collection_framework.ArrayListExShoping;

public class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId,String name, double price){
        this.productId = productId;
        this.name= name;
        this.price=price;
    }

    public int productId() {
        return productId;
    }

    public Product setProductId(int productId) {
        this.productId = productId;
        return this;
    }

    public String getname() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Product setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString(){
        return "ProductId : "+productId +", Name :"+ name +" , Price :"+ price;
    }
}
