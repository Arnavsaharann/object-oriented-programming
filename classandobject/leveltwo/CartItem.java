package com.bridgelabz.classandobject.leveltwo;

public class CartItem {
    public String itemName;
    public int quantity;
    public double price;

    public CartItem(String itemName, int quantity, double price){
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }
    public void addItemToCart(int quantity){
        if (quantity > 0) {
            this.quantity += quantity;
            System.out.println(quantity + " more " + itemName + "(s) added to the cart.");
        } else {
            System.out.println("Invalid quantity to add.");
        }
    }

    public void removeItemFromCart(int quantity) {
        if (quantity > 0 && quantity <= this.quantity) {
            this.quantity -= quantity;
            System.out.println(quantity + " " + itemName + "(s) removed from the cart.");
        }else {
            System.out.println("Error: You cannot remove more than what is in the cart!");
        }
    }

    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("\n\nItem: " + itemName);
        System.out.println("Unit Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + totalCost);
    }

    public static void main(String[] args){
            CartItem item = new CartItem("Laptop", 2, 15000);
            item.displayTotalCost();

            item.addItemToCart(2);  // Add 2 more laptops
            item.displayTotalCost();

            item.removeItemFromCart(3); // Remove 3 laptops
            item.displayTotalCost();

    }
}
