package com.bridgelabz.staticinstancefinalkeywords.levelone;

public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Setting discount before adding products
        Product.updateDiscount(10);

        // Creating products
        Product product1 = new Product("Laptop", 75000.00, 2, 101);
        Product product2 = new Product("Smartphone", 50000.00, 1, 102);

        // Displaying product details
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
    }
}

class Product {
    private static double discount; // Shared discount for all products
    private String productName;
    private double price;
    private int quantity;
    private final int productID; // Unique ID that cannot be changed

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Constructor using `this` to initialize attributes
    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Display Product Details with instanceof check
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Price after Discount: $" + calculateDiscountedPrice());
        } else {
            System.out.println("Invalid Product Object");
        }
    }

    private double calculateDiscountedPrice() {
        return price * quantity * (1 - discount / 100);
    }
}