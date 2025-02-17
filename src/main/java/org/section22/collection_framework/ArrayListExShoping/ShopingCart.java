package org.section22.collection_framework.ArrayListExShoping;

import java.util.ArrayList;
import java.util.Scanner;
import org.section22.collection_framework.ArrayListExShoping.Product;

public class ShopingCart {
    public static void main(String[] args) {
        ShopCartImp cart = new ShopCartImp();
        Scanner sc =new Scanner(System.in);

        ArrayList<Product> shoppingCart = new ArrayList<>();

        while (true){
            System.out.println(" \n ====Shopping Cart Menu=====");

            System.out.println("1.Add Product\n" +
                               "2.View cart\n"+
                               "3.Remove Product\n" +
                               "4 Calculate Total Price\n" +
                                "5 Find expensive product"+
                               "6 Exit\n");
            System.out.println(" Choice an option :");
            int choice = sc.nextInt();

            switch (choice){
                case 1 -> addProduct(sc,shoppingCart);
                case 2 ->viewCart(sc,shoppingCart);
                case 3 -> removeProduct(sc,shoppingCart);
                case 4 -> calculatePrice(shoppingCart);
                case 5 -> cart.findMostExpProd(shoppingCart);
                case 6 -> {
                    System.out.println("Thank you for using shopping cart !");
                    sc.close();;
                    return;
                }
                default  -> System.out.println("invalid Input try again");
            }
        }


    }
    private static void addProduct(Scanner sc, ArrayList<Product> shoppingCart) {
        System.out.println("Enter Product Id :");
        int productId = sc.nextInt();
        sc.nextLine(); //consume new line

        System.out.println("Enter Prodct name :");
        String name = sc.nextLine();

        System.out.println("enter Product price:");
        double price = sc.nextDouble();

        //add product to cart
        shoppingCart.add(new Product(productId,name,price));
        System.out.println("Product added to cart" );

    }

    private static void viewCart(Scanner sc, ArrayList<Product> shoppingCart) {
      if (shoppingCart.isEmpty())  {
          System.out.println("Your cart is empty");
          return;
       }
        System.out.println(" \n ==== shopping cart ===");
      for (Product p : shoppingCart){
          System.out.println(p);
      }
    }
    private static void removeProduct(Scanner sc, ArrayList<Product> shoppingCart) {
        if(shoppingCart.isEmpty()){
            System.out.println(" your cart is empty ,no product to remove");
            return;
        }
        System.out.println("enter the product Id  which you want to remove :");
int userProductId = sc.nextInt();
boolean removed = shoppingCart.removeIf(product -> product.productId() == userProductId );

if(removed){
    System.out.println("Product Removed successfully !");
}else {
    System.out.println("Product not found in the cart");
}



    }



    private static void calculatePrice(ArrayList<Product> shoppingCart) {
        if(shoppingCart.isEmpty()){
            System.out.println(" your cart is empty");
            return;
        }
        //A stream is like a pipeline that allows you to process elements (in this case, Product objects) in the list one by one.
        double totalPrice = shoppingCart.stream().mapToDouble(Product::getPrice).sum();
        System.out.printf("Total price of Product in cart: $%.2f%n",totalPrice);

        //with out stream
//        double totalPricef = 0.0;
//        for (Product product : shoppingCart) {
//            totalPricef += product.getPrice();
//        }

    }


    }




