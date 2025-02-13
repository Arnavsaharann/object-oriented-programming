package com.bridgelabz.Inheritance.levelone;


public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle electric = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle petrol = new PetrolVehicle("Ford Mustang", 250);

        electric.displayVehicleDetails();
        System.out.println();

        petrol.displayVehicleDetails();
        petrol.refuel();
        System.out.println();
    }
}

class FourWheeler {
    protected String model;
    protected int maxSpeed;

    public FourWheeler(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends FourWheeler {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
}

class PetrolVehicle extends FourWheeler implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling Petrol Vehicle: " + model);
    }
}
