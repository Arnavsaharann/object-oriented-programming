package com.bridgelabz.Inheritance.levelone;

public class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat thermostat1 = new Thermostat(101, "ON", 22.5);
        Thermostat thermostat2 = new Thermostat(102, "OFF", 18.0);

        thermostat1.displayStatus();
        thermostat2.displayStatus();
    }
}

class Device {
    protected int deviceId;
    protected String status;

    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(int deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting);
        System.out.println();
    }
}