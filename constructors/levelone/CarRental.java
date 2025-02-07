package com.bridgelabz.constructors.levelone;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    static private int perDayCost = 1000;

    public CarRental(String customerName, String carModel, int rentalDays ){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateCost(){
        return this.rentalDays * perDayCost;
    }

    public void displayDetails(){
        System.out.println("customerName: " + customerName);
        System.out.println("carModel: " + carModel);
        System.out.println("rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateCost());
    }
    public static void main(String[] args){

        CarRental car = new CarRental("Mayank Pal", "Porche Tycan", 2);
        car.displayDetails();


    }
}
