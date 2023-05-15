package com.dealerships;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();

    }
    public List<Vehicle> getVehicleByPrice (double min, double max) {
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max){
            
            }
        }
        return null;
    }
    public List<Vehicle> getVehicleByMakeModel (String make, String model) {
        return null;
    }
    public List<Vehicle> getVehicleByYear (int min, int max) {
        return null;
    }
    public List<Vehicle> getVehicleByColor (String color) {
        return null;
    }
    public List<Vehicle> getVehicleByMiles (int min, int max) {
        return null;
    }
    public List<Vehicle> getVehiclesByType (String vehicleType) {
        return null;
    }
    public List<Vehicle> getAllVehicles () {
        return inventory;
    }
    public void addVehicle (Vehicle vehicle){
        inventory.add(vehicle);
    }
    public void removeVehicle(){
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return name +
                "|" + address +
                "|" + phone;
    }
}
