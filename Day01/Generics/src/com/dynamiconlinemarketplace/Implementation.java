package com.dynamiconlinemarketplace;

public class Implementation {

    public static void main(String[] args) {
        Marketplace marketplace = new Marketplace();
        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory("Anuj"));
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 800, new ClothingCategory("Shirt"));
        Product<GadgetCategory> phone = new Product<>("Smartphone", 15000, new GadgetCategory("Phone"));

        marketplace.addProduct(book);
        marketplace.addProduct(shirt);
        marketplace.addProduct(phone);

        System.out.println("Before discount:");
        marketplace.display();

        Marketplace.applyDiscount(book, 10);
        Marketplace.applyDiscount(shirt, 15);
        Marketplace.applyDiscount(phone, 5);

        System.out.println("\nAfter discount:");
        marketplace.display();
    }
    }

