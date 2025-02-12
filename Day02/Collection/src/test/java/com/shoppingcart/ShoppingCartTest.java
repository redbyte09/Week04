package com.shoppingcart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();

        // Add products to catalog
        cart.addProductToCatalog("Laptop", 1200.00);
        cart.addProductToCatalog("Phone", 800.00);
        cart.addProductToCatalog("Headphones", 150.00);
        cart.addProductToCatalog("Mouse", 50.00);

        // Add items to cart
        cart.addToCart("Phone");
        cart.addToCart("Mouse");
        cart.addToCart("Laptop");
    }

    @Test
    void testAddToCart() {
        Map<String, Double> expectedCart = new LinkedHashMap<>();
        expectedCart.put("Phone", 800.00);
        expectedCart.put("Mouse", 50.00);
        expectedCart.put("Laptop", 1200.00);

        assertEquals(expectedCart, cart.getCartInOrder());
    }

    @Test
    void testTotalPrice() {
        double expectedTotal = 800.00 + 50.00 + 1200.00;
        assertEquals(expectedTotal, cart.getTotalPrice(), 0.01);
    }

    @Test
    void testCartSortedByPrice() {
        Map<String, Double> expectedSortedCart = new LinkedHashMap<>();
        expectedSortedCart.put("Mouse", 50.00);
        expectedSortedCart.put("Phone", 800.00);
        expectedSortedCart.put("Laptop", 1200.00);

        assertEquals(expectedSortedCart, cart.getCartSortedByPrice());
    }

    @Test
    void testProductNotFound() {
        cart.addToCart("Tablet"); // Not in catalog
        assertFalse(cart.getCartInOrder().containsKey("Tablet"));
    }
}
