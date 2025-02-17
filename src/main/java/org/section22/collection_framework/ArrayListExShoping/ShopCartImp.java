package org.section22.collection_framework.ArrayListExShoping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShopCartImp {
    private List<Product> shopCartImp;

    public ShopCartImp() {
        this.shopCartImp = new ArrayList<>();
    }

    //add product to shopping cart
    public void addProd(Product product) {
        shopCartImp.add(product);
    }

    // Calculate total price of all products
    public double calToatalPrice() {
        return shopCartImp.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }


    // Find the most expensive product
    public Product findMostExpProd(List<Product> shopCartImp) {
        return shopCartImp.stream()
                .max((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .orElse(null);
    }

    // Find Cheapest Product
    public Product findCheapestProd(List<Product> shopCartImp) {
        return shopCartImp.stream()
                .min((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .orElse(null);
    }

    // Count products above a certain price
    //reten type is long
public long coundProdabivePrice(double threshold,List<Product> shopCartImp){
        return shopCartImp.stream()
                .filter((product -> product.getPrice() > threshold))
                .count();
}

    // Get a list of all product names
public List<String > getallProdNames(){
        return shopCartImp.stream()
                .map(Product::getname)
                .toList();
}

    // Calculate average price of products
public  double calAvg(){
        return shopCartImp.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);
}

//    // Group products by price range

    public Map<String, List<Product>> groupProdByPriceRange(){
        return shopCartImp.stream()
                .collect(Collectors.groupingBy(product ->{
                    if (product.getPrice()<1000) return "Low";
                    else if (product.getPrice()<=5000)return "Medium";
                    else return "High";
                }));
    }
    // Sort products by name
public List<Product> sortByName(){
      return  shopCartImp.stream()
              .sorted((p1,p2)-> p1.getname().compareTo(p2.getname()))
              .toList();
}
    // Check if all products are below a certain price
public boolean areAllProdBelowP(double maxPrice){
        return shopCartImp.stream()
                .allMatch(product->product.getPrice()<= maxPrice);
}
    // Find the first product matching a condition

    public Product findFirstProdByPrice(double searchPrice){
        return shopCartImp.stream()
                .filter(product -> product.getPrice() == searchPrice)
                .findFirst()
                .orElse(null)
                ;
    }

    // Get a sublist of products below a specific price
public List<Product> getProdBelowPrice(double maxPrice){
        return shopCartImp.stream()
                .filter(product -> product.getPrice()< maxPrice)
                .toList()
                ;
}
    // Check if any product matches a condition
public boolean doesprodExitst(String searchName){
        return shopCartImp.stream()
                .allMatch(product -> product.getname().equalsIgnoreCase(searchName));
}

//get distinct prodnames
    public List<String> getDistictProductNames(){
        return shopCartImp.stream()
                .map(Product::getname)
                .distinct()
                .toList();

    }

    //    // Print all products in the shopping cart
    public void display(){
        shopCartImp.forEach(System.out::println);
    }
    // Get the current size of the shopping cart
public  int getCartSize(){
        return shopCartImp.size();
}

}
