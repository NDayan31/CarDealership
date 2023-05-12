package com.dealerships;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phoneNumber;

    static ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public Object getVehicleByPrice (double min, double max) {
        return null;
    }
    public Object getVehicleByMakeModel (String make, String model) {
        return null;
    }
    public Object getVehicleByYear (int min, int max) {return null;}
    public Object getVehicleByColor (String color) {return null;}
    public Object getVehicleByMiles (int min, int max) {return null;}
    public Object getVehiclesByType (String vehicleType) {return null;}
    public Object getAllVehicles () {return null;}
    public void addVehicle (){}
    public void removeVehicle(){}
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return name +
                "|" + address +
                "|" + phoneNumber;
    }
}
