package com.shoppingcart;

import java.util.*;

public class ShoppingCart {
    private final Map<String, Double> productPrices; // Stores product prices
    private final Map<String, Double> cart; // Stores items added to cart

    // Constructor initializes HashMap and LinkedHashMap
    public ShoppingCart() {
        this.productPrices = new HashMap<>(); // Product catalog
        this.cart = new LinkedHashMap<>(); // Cart maintains order of items added
    }

    // Add a product to the catalog
    public void addProductToCatalog(String product, double price) {
        productPrices.put(product, price);
    }

    // Add a product to the cart
    public void addToCart(String product) {
        if (productPrices.containsKey(product)) {
            cart.put(product, productPrices.get(product));
        } else {
            System.out.println("Product not found in catalog.");
        }
    }

    // Get total price of the cart
    public double getTotalPrice() {
        double total = 0.0;
        for (double price : cart.values()) {
            total += price;
        }
        return total;
    }

    // Get items in the order they were added
    public Map<String, Double> getCartInOrder() {
        return new LinkedHashMap<>(cart);
    }

    // Get items sorted by price
    public Map<String, Double> getCartSortedByPrice() {
        return new TreeMap<>();
    }

    // Display cart details
    public void displayCart() {
        System.out.println("Cart (Order of Addition): " + getCartInOrder());
        System.out.println("Cart (Sorted by Price): " + getCartSortedByPrice());
        System.out.println("Total Price: $" + getTotalPrice());
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add products to catalog
        cart.addProductToCatalog("Laptop", 1200.00);
        cart.addProductToCatalog("Phone", 800.00);
        cart.addProductToCatalog("Headphones", 150.00);
        cart.addProductToCatalog("Mouse", 50.00);

        // Add items to cart
        cart.addToCart("Phone");
        cart.addToCart("Mouse");
        cart.addToCart("Laptop");

        // Display cart
        cart.displayCart();
    }
}

