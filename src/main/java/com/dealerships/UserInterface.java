package com.dealerships;

import java.util.Scanner;

public class UserInterface {

    static Scanner input = new Scanner(System.in);
    public void display () {
        System.out.println("=================================");
        System.out.println("\t1. Search by Price");
        System.out.println("\t2. Search by Make and Model");
        System.out.println("\t3. Search by Year");
        System.out.println("\t4. Search by Color");
        System.out.println("\t5. Search by Odometer Reading");
        System.out.println("\t6. Search by Vehicle Type");
        System.out.println("\t7. Search All Vehicles");
        System.out.println("\t8. Add a vehicle");
        System.out.println("\t9. Remove Vehicle");
        System.out.println("\t0. Exit");
        System.out.print("Please select an option: ");
    }
    public void processGetByPriceRequest() {

    }
    public void processGetByMakeModelRequest() {

    }
    public void processGetByYearRequest() {

    }
    public void processGetByColorRequest() {

    }
    public void processGetByMileageRequest() {

    }
    public void processGetByVehicleTypeRequest() {

    }
    public void processGetAllVehicleRequest() {

    }
    public void processAddVehicleRequest() {

    }
    public void processRemoveVehicleRequest() {

    }
}
