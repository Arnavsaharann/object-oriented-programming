package com.bridgelabz.Inheritance.levelone;

import java.util.ArrayList;

public class VehicleAndTransportSystem {

    public static void main(String[] args){
        Car car = new Car(100,"petrol", 5);
        Truck truck  = new Truck(60,"deisel", 2);
        Motorcycle motercycle = new Motorcycle(110, "petrol", true);


        Vehicle vehicles = new Vehicle();

        vehicles.addVehicles(car);
        vehicles.addVehicles(truck);
        vehicles.addVehicles(motercycle);

        vehicles.AllVehiclesInfo();

    }
}


class Vehicle {
    private int maxSpeed;
    private String fuelType;
    private ArrayList<Vehicle>vehicles;

    public Vehicle(){
        this.vehicles = new ArrayList<>();
    }

    public void addVehicles(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void AllVehiclesInfo(){
        for(Vehicle vehicle : vehicles){
            vehicle.displayInfo();
        }
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}


class Car extends Vehicle {

    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    public void displayInfo() {
        super.displayInfo(); // Call Vehicle's method
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println();
    }
}

class Truck extends Vehicle{

    private double loadCapacity; // in tons

    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println();
    }

}

class Motorcycle extends Vehicle{
    private boolean hasBackrest;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasBackrest = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasBackrest );
        System.out.println();
    }
}