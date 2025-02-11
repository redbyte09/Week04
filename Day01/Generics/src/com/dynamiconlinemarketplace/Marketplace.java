package com.dynamiconlinemarketplace;

import java.util.*;
public class Marketplace {
    private List<Product<?>> products=new ArrayList<>();
    public void addProduct(Product<?> product){
        products.add(product);
    }

    public void display(){
        for(Product <?> product:products){
            product.display();
        }
    }

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() - (product.getPrice() * (percentage / 100));
        product.setPrice(discountedPrice);
        System.out.println("Discount applied! New price of " + product.getName() + " is: " + product.getPrice());
    }

}
