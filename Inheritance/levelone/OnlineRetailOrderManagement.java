package com.bridgelabz.Inheritance.levelone;

public class OnlineRetailOrderManagement {
    public static void main(String[] args){
        DeliveredOrder order1 = new DeliveredOrder("1001", "2024-02-12", "ABC123", "2024-02-14");

        DeliveredOrder order2 = new DeliveredOrder("1002", "2024-02-10", "TRK67890", "2024-02-13");

        order1.display();
        order2.display();
    }
}

class Order{
    private String orderId;
    private String orderDate;

    public Order(String orderId, String orderDate){
        this.orderDate = orderDate;
        this.orderId = orderId;
    }

    public void display(){
        System.out.println("The order id: " + orderId);
        System.out.println("The order Date id: " + orderDate);
    }

}

class ShippedOrder extends Order{
    private String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber){
        super(orderId,orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("The tracking Number id: " + trackingNumber);
    }


}

class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate = deliveryDate;
    }


    @Override
    public void display(){
        super.display();
        System.out.println("The delivery Date is: " + deliveryDate);
        System.out.println();

    }
}