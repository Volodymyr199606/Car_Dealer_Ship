package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner scanner = new Scanner(System.in);

    public UserInterface() {
    }

    private void init() {
        DealerShipFileManager fileManager = new DealerShipFileManager();
        this.dealership = fileManager.getDealerShip();
    }

    private void displayMenu() {
        System.out.println("1. Get all vehicles");
        System.out.println("2. Get vehicles by price");
        System.out.println("3. Get vehicles by make and model");
        System.out.println("4. Get vehicles by year");
        System.out.println("5. Get vehicles by color");
        System.out.println("6. Get vehicles by mileage");
        System.out.println("7. Get vehicles by type");
        System.out.println("8. Remove a vehicle");

    }

    private void displayVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public void display() {
        init();
        while (true) {
            displayMenu();
            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    processAllVehiclesRequest();
                    break;
                case "2":
                    // processGetByPriceRequest();
                    break;
                case "3":
                    // processGetByMakeModelRequest();
                    break;
                case "4":
                    // processGetByYearRequest();
                    break;
                case "5":
                    // processGetByColorRequest();
                    break;
                case "6":
                    // processGetByMileageRequest();
                    break;
                case "7":
                    // processGetByVehicleTypeRequest();
                    break;
                case "8":
                    // processRemoveVehicleRequest();
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }

    private void processAllVehiclesRequest() {
        List<Vehicle> allVehicles = dealership.getAllVehicles();
        displayVehicles(allVehicles);
    }


}