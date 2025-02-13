package com.bridgelabz.encapsulationpolymorphisminterfaceandabstractclass.levelone;

import java.util.ArrayList;

public class VehicleRentalSystem {
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList();

        Vehicle maruti = new Car("123", "OG", 1500, "CAR123");
        Vehicle tataTruck = new Truck("456", "Truck", 3000, "TRUCK456");
        Vehicle splendor = new Bike("789", "Bike", 500, "BIKE789");

        vehicles.add(maruti);
        vehicles.add(tataTruck);
        vehicles.add(splendor);

        calculateRentalAndInsurance(vehicles, 5);
    }

    public static void calculateRentalAndInsurance( ArrayList<Vehicle> vehicles, int days){
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getType() + " (Vehicle No: " + vehicle.getVehicleNumber() + ")");
            System.out.println("Rental Cost for " + days + " days: ₹" + vehicle.calculateRentalCost(days));
            double insuranceCost = 0;
            if (vehicle instanceof Insurable) {  //  Ensure it's insurable before calling insurance methods
                insuranceCost = ((Insurable) vehicle).calculateInsurance();
                System.out.println("Insurance Cost: ₹" + insuranceCost);
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
            }
        }
    }
}
abstract class Vehicle{
    private String vehicleNumber;
    private String type;
    private int rentalRate;

    public Vehicle(String vehicleNumber, String type, int rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public String getType(){
        return type;
    }
    public int getRentalRate(){
        return rentalRate;
    }
}

interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}


class Car extends Vehicle implements Insurable{
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, String type, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days){
        return getRentalRate() * days;
    }

    public double calculateInsurance(){
        return getRentalRate() * 0.1;
    }

    public String getInsuranceDetails(){
        return "the policy number is: " + insurancePolicyNumber;
    }
}

class Bike extends Vehicle implements Insurable{
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, String type, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days){
        return getRentalRate() * days;
    }

    public double calculateInsurance(){
        return getRentalRate() * 0.1;
    }

    public String getInsuranceDetails(){
        return "the policy number is: " + insurancePolicyNumber;
    }
}
class Truck extends Vehicle implements Insurable{
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, String type, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double calculateRentalCost(int days){
        return getRentalRate() * days;
    }

    public double calculateInsurance(){
        return getRentalRate() * 0.1;
    }

    public String getInsuranceDetails(){
        return "the policy number is: " + insurancePolicyNumber;
    }
}


