package com.pluralsight.Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DealershipTest

{
    @Test
    void addVehicle_Should_AddAVehicle_ToArrayList()
    {
        //arrange

        Dealership dealership = new Dealership("Test Dealership", "123 Test St", "555-555-5555");
        Vehicle vehicle = new Vehicle(1, 2020, "Test Make", "Test Model", "Test Type", "Test Color", 1000, 10000.00);
        dealership.addVehicle(vehicle);
        assertEquals(1, dealership.getInventory().size());
    }

    @Test
    void getAllVehicles()
    {
        Dealership dealership = new Dealership("Test Dealership", "123 Test St", "555-555-5555");
        Vehicle vehicle = new Vehicle(1, 2020, "Test Make", "Test Model", "Test Type", "Test Color", 1000, 10000.00);
        dealership.addVehicle(vehicle);
        assertEquals(1, dealership.getAllVehicles().size());
    }

    @Test
    void getVehiclesByPrice()
    {
        Dealership dealership = new Dealership("Test Dealership", "123 Test St", "555-555-5555");
        Vehicle vehicle = new Vehicle(1, 2020, "Test Make", "Test Model", "Test Type", "Test Color", 1000, 10000.00);
        dealership.addVehicle(vehicle);
        assertEquals(1, dealership.getVehiclesByPrice(5000.00, 15000.00).size());
    }

    @Test
    void getVehiclesByMakeModel()
    {
        Dealership dealership = new Dealership("Test Dealership", "123 Test St", "555-555-5555");
        Vehicle vehicle = new Vehicle(1, 2020, "Test Make", "Test Model", "Test Type", "Test Color", 1000, 10000.00);
        dealership.addVehicle(vehicle);
        assertEquals(1, dealership.getVehiclesByMakeModel("Test Make", "Test Model").size());
    }
}
