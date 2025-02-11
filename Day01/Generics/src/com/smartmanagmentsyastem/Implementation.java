package com.smartmanagmentsyastem;

import java.util.ArrayList;
import java.util.List;
public class Implementation {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Furniture>furnitureStorage=new Storage<>();
        Storage<Groceries>groceriesStorage=new Storage<>();

        electronicsStorage.addItem(new Electronics("Laptop",55000,"HP"));
        electronicsStorage.addItem(new Electronics("Phone",15000,"Narzo"));

        // Adding items to furniture storage
        furnitureStorage.addItem(new Furniture("Chair", 2000, "Wood"));
        furnitureStorage.addItem(new Furniture("Table", 5000, "Metal"));

        // Adding items to groceries storage
        groceriesStorage.addItem(new Groceries("Apple", 200, "2025-01-01"));
        groceriesStorage.addItem(new Groceries("Milk", 50, "2024-07-30"));

        // Displaying all items
        System.out.println("Electronics Items:");
        electronicsStorage.displayAllItem(electronicsStorage.getItems());

        System.out.println("\nFurniture Items:");
        furnitureStorage.displayAllItem(furnitureStorage.getItems());

        System.out.println("\nGroceries Items:");
        groceriesStorage.displayAllItem(groceriesStorage.getItems());
    }
}
