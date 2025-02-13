package com.bridgelabz.encapsulationpolymorphisminterfaceandabstractclass.levelone;

import java.util.ArrayList;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args){
        ArrayList<FoodItem> orderList = new ArrayList<>();
        FoodItem vegBurger = new VegItem("Veg Burger", 120, 2);
        FoodItem chickenBurger = new NonVegItem("Chicken Pizza", 300, 1);
        FoodItem vegPizza = new VegItem("Paneer Wrap", 150, 1);

        orderList.add(vegBurger);
        orderList.add(chickenBurger);
        orderList.add(vegPizza);

        System.out.println("FIXING DISCOUNT");
        for (FoodItem item : orderList) {
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item; // Downcasting
                discountableItem.applyDiscount(10); // Apply 10% discount
            }
        }


        for (FoodItem item : orderList){
            item.getItemDetails();
            System.out.println("Total Price (after discount): ₹" + item.calculateTotalPrice());
            if(item instanceof Discountable){
                System.out.println(((Discountable)item).getDiscountDetails());
            }
            System.out.println();
        }


    }

}

abstract class FoodItem{
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price,int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails(){
        System.out.println("Item Name: " + itemName);
        System.out.println("price : " + price);
        System.out.println("quantity: " + quantity);
    }

    public double getPrice(){
        return price;
    }
    public String getItemName(){
        return itemName;
    }
    public int getQuantity(){
        return quantity;
    }
}

interface Discountable{
    void applyDiscount(double discountPercentage);
    String getDiscountDetails();
}


class VegItem extends FoodItem implements Discountable{
    private double discount;

    public VegItem(String itemName, double price,int quantity){
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice(){
        double total = getPrice() * getQuantity();
        return total - (total * discount / 100);
    }

    public void applyDiscount(double discountPercentage){
        discount = discountPercentage;
    }

    public String getDiscountDetails(){
        return "Discount on " + getItemName() + " is: " + discount ;
    }
}

class NonVegItem extends FoodItem implements Discountable{
    private double discount;

    public NonVegItem(String itemName, double price,int quantity){
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice(){
        double total = getPrice() * getQuantity();
        return total - (total * discount / 100);
    }

    public void applyDiscount(double discountPercentage){
        discount = discountPercentage;
    }

    public String getDiscountDetails(){
        return "Discount on " + getItemName() + " is: " + discount ;
    }

}