//package com.bridgelabz.classandobject.levelone;
//
//import java.util.Scanner;
//
//public class Item {
//    public int itemCode;
//    public String itemName;
//    public double price;
//
//    public Item(int itemCode, String itemName, double price){
//        this.itemCode = itemCode;
//        this.itemName = itemName;
//        this.price = price;
//    }
//    public void displayDetails(){
//        System.out.println("itemCode: " + itemCode);
//        System.out.println("itemName: " + itemName);
//        System.out.println("price: $" + price);
//    }
//
//    public double calculateTotalCost(int quantity) {
//        return price * quantity;
//    }
//
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        Item item = new Item(121, "shaving cream", 110);
//        item.displayDetails();
//
//        System.out.print("enter the quantity: ");
//
//        int quantity = input.nextInt();
//        System.out.println("\nTotal cost for " + quantity + " items: $" + item.calculateTotalCost(quantity));
//    }
//}
package com.bridgelabz.classandobject.levelone;

import java.util.ArrayList;

class CartItem {
    private String itemName;
    static double price;
    static int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public static double getTotalPrice() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println(itemName + " - ₹" + price + " x " + quantity + " = ₹" + getTotalPrice());
    }
}

class ShoppingCart {
    private String cartName;
    private ArrayList<CartItem> items;

    public ShoppingCart(String cartName) {
        this.cartName = cartName;
        this.items = new ArrayList<>();
    }

    public String getCartName() {
        return cartName;
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void displayCart() {
        System.out.println("\nShopping Cart: " + cartName);
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            double totalCost = 0;
            for (CartItem item : items) {
                item.displayItem();
                totalCost += item.getTotalPrice();
            }
            System.out.println("Total Cost: ₹" + totalCost);
        }
    }
}

class CartManager {
    private ArrayList<ShoppingCart> carts;

    public CartManager() {
        this.carts = new ArrayList<>();
    }

    public void addCart(ShoppingCart cart) {
        carts.add(cart);
    }

    public void displayAllCartNames() {
        System.out.println("\nAll Shopping Carts:");
        for (ShoppingCart cart : carts) {
            System.out.println("- " + cart.getCartName());
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        CartManager manager = new CartManager();

        ShoppingCart cart1 = new ShoppingCart("Electronics Cart");
        cart1.addItem(new CartItem("Laptop", 75000, 1));
        cart1.addItem(new CartItem("Smartphone", 40000, 2));
        cart1.addItem(new CartItem("Headphones", 5000, 1));

        ShoppingCart cart2 = new ShoppingCart("Grocery Cart");
        cart2.addItem(new CartItem("Rice", 2000, 1));
        cart2.addItem(new CartItem("Vegetables", 500, 2));

        ShoppingCart cart3 = new ShoppingCart("Fashion Cart");
        cart3.addItem(new CartItem("T-shirt", 1500, 2));
        cart3.addItem(new CartItem("Jeans", 3000, 1));

        manager.addCart(cart1);
        manager.addCart(cart2);
        manager.addCart(cart3);

        manager.displayAllCartNames();

        cart3.displayCart();
        cart1.displayCart();

    }
}
