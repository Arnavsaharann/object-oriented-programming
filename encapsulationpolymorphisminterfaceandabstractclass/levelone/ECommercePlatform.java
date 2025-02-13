package com.bridgelabz.encapsulationpolymorphisminterfaceandabstractclass.levelone;

import java.util.ArrayList;

public class ECommercePlatform {
    public static void main(String[] args){

        ArrayList<Product> productList = new ArrayList<>();

        /*
        productList.add(new Electronics(101, "Laptop", 75000, 18));
        productList.add(new Clothing(202, "T-Shirt", 1500, 12));
        productList.add(new Groceries(303, "Rice", 2000, 5));
        */

        Product laptop = new Electronics(101, "laptop", 75000, 18);
        Product tshirt = new Clothing(202, "shirt", 1500, 12);
        Product rice = new Groceries(303, "rice", 2000, 5);
        productList.add(laptop);
        productList.add(tshirt);
        productList.add(rice);

        calculateAndPrintFinalPrice(productList);
    }

    public static void calculateAndPrintFinalPrice(ArrayList<Product> productList){
        for (Product product : productList){
            double tax = ((Taxable)product).calculateTax();  //  No need for `instanceof`
            System.out.println(product.getName() + " " + (product.getPrice() + tax - product.calculateDiscount()));
        }
    }
}

abstract class Product{
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public int getProductId(){
        return productId;
    }
}

interface Taxable{
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double taxRate;

    public Electronics(int productId, String name, double price, double taxRate) {
        super(productId, name, price);
        this.taxRate = taxRate;
    }

    public double calculateDiscount(){
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * (taxRate / 100);
    }

    public String getTaxDetails() {
        return "tax for Electronics: " + taxRate;
    }

}

class Clothing extends Product implements Taxable{
    private double taxRate;

    public Clothing(int productId, String name, double price, double taxRate) {
        super(productId, name, price);
        this.taxRate = taxRate;
    }

    public double calculateDiscount(){
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * (taxRate / 100);
    }

    public String getTaxDetails() {
        return "tax for Clothing: " + taxRate;
    }
}

class Groceries extends Product implements Taxable{
    private double taxRate;

    public Groceries(int productId, String name, double price, double taxRate) {
        super(productId, name, price);
        this.taxRate = taxRate;
    }

    public double calculateDiscount(){
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * (taxRate / 100);
    }

    public String getTaxDetails() {
        return "tax for Clothing: " + taxRate;
    }
}

