package com.bridgelabz.objectmodeling.levelone;

import java.util.ArrayList;

//  Main Class for E-commerce System
public class ECommercePlatform {
    public static void main(String[] args) {
        ECommerceCustomer customer1 = new ECommerceCustomer("Arnav"); // Creating customer object

        Product product1 = new Product("Laptop", 75000); // Creating product object
        Product product2 = new Product("Smartphone", 40000); // Creating product object
        Product product3 = new Product("Headphones", 5000); // Creating product object

        Order order1 = new Order(101, customer1); // Creating order object
        order1.addProduct(product1); // Adding products to order
        order1.addProduct(product2);

        Order order2 = new Order(102, customer1); // Creating another order
        order2.addProduct(product3);

        customer1.addOrder(order1); // Customer places an order
        customer1.addOrder(order2); // Customer places another order

        customer1.displayCustomerDetails(); // Displaying order details
    }
}

//  ECommerceCustomer Class (Has Multiple Orders)
class ECommerceCustomer {
    private String customerName;
    private ArrayList<Order> orders;

    public ECommerceCustomer(String customerName) {
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void displayCustomerDetails() {
        System.out.println("Customer: " + customerName);
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }

    //  Getter method to access customerName
    public String getCustomerName() {
        return customerName;
    }
}

//  Order Class (Has Multiple Products)
class Order {
    private int orderId;
    private ECommerceCustomer customer;
    private ArrayList<Product> products;

    public Order(int orderId, ECommerceCustomer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderDetails() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Ordered by: " + customer.getCustomerName());
        System.out.println("Products in this order:");
        for (Product product : products) {
            product.displayProductDetails();
        }
    }
}

//  Product Class (Independent Entity)
class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void displayProductDetails() {
        System.out.println(" - " + productName + " | Price: ₹" + price);
    }
}

