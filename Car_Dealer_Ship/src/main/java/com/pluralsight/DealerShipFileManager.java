package com.pluralsight;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;


public class DealerShipFileManager {
    private static final String FILE_PATH = "Files/inventory.scv";

    public Dealership getDealerShip() {
        File file = new File(FILE_PATH);
        try {
            Scanner scanner = new Scanner(file);
            String[] dealershipDetails = scanner.nextLine().split("\\|");
            Dealership dealership = new Dealership(dealershipDetails[0], dealershipDetails[1], dealershipDetails[2]);

            while (scanner.hasNextLine()) {
                String[] vehicleDetails = scanner.nextLine().split("\\|");
                Vehicle vehicle = new Vehicle(
                        Integer.parseInt(vehicleDetails[0]),
                        Integer.parseInt(vehicleDetails[1]),
                        vehicleDetails[2],
                        vehicleDetails[3],
                        vehicleDetails[4],
                        vehicleDetails[5],
                        Integer.parseInt(vehicleDetails[6]),
                        Double.parseDouble(vehicleDetails[7])
                );
                dealership.addVehicle(vehicle);
            }

            scanner.close();
            return dealership;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void saveDealership(Dealership dealership) {
        try {
            PrintWriter writer = new PrintWriter(FILE_PATH);
            writer.println(dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhoneNumber());

            for (Vehicle vehicle : dealership.getInventory()) {
                writer.println(vehicle.getId() + "|" + vehicle.getYear() + "|" + vehicle.getMake() + "|" + vehicle.getModel() + "|" + vehicle.getType() + "|" + vehicle.getColor() + "|" + vehicle.getMileage() + "|" + vehicle.getPrice());
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}