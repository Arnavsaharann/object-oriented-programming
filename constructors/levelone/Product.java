package com.bridgelabz.constructors.levelone;

public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    public Product(String productName,double price){
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails(){
        System.out.println("productName: " + productName);
        System.out.println("price: " + price);
    }

    public static void displayTotalProducts(){
        System.out.println("Total Products Created : " + totalProducts);
    }

    public static void main(String[] args){
        Product p1 = new Product("Pencil",10);
        Product p2 = new Product("Pen",40);
        p1.displayProductDetails();

        System.out.println();
        // for Space between the two outputs
        p2.displayProductDetails();

        System.out.println();

        displayTotalProducts(); // static method can be called without an object

    }

}
