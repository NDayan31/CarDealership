package com.dealerships;

import java.io.*;

public class DealershipFileManager {

    static String fileName = "DealershipInventory.csv";

    public void getDealership() throws IOException{
        BufferedReader bfr = new BufferedReader(new FileReader(fileName));
        String line;
        int lineNumber = 1;

        while ((line = bfr.readLine()) != null) {

                String[] getDealershipInfo = line.split("\\|");
                String name = getDealershipInfo[0];
                String address = getDealershipInfo[1];
                String phoneNumber = getDealershipInfo[2];

                Dealership dealership = new Dealership(name, address, phoneNumber);

            if (lineNumber != 1) {
                String[] getInventoryInfo = line.split("\\|");

                // vin|year|Make|Model|Type|color|odo|price
                int vin = Integer.parseInt(getInventoryInfo[0]);
                int year = Integer.parseInt(getInventoryInfo[1]);
                String make = getInventoryInfo[2];
                String model = getInventoryInfo[3];
                String vehicleType = getInventoryInfo[4];
                String color = getInventoryInfo[5];
                int odometer = Integer.parseInt(getInventoryInfo[6]);
                double price = Double.parseDouble(getInventoryInfo[7]);

                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                dealership.addVehicle(vehicle);
                }
            lineNumber++;
        }
        bfr.close();
    }
    public void saveDealership (Dealership vehicles) throws IOException {

    }
}
