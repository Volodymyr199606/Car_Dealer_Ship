package com.pluralsight.Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DealershipTest
{
    @Test
    void addVehicle_Should_AddAVehicle_ToArrayList()
    {
        // arrange
        Dealership dealership = new Dealership("Test Dealership", "123 Test St", "555-555-5555");
        Vehicle vehicle = new Vehicle(1, 2020, "Test Make", "Test Model", "Test Type", "Test Color", 1000, 10000.00);

        // act
        dealership.addVehicle(vehicle);

        // assert
        assertEquals(1, dealership.getInventory().size());
        assertTrue(dealership.getInventory().contains(vehicle));
    }

    @Test
    void removeVehicle_Should_RemoveVehicle_FromArrayList()
    {
        // arrange
        Dealership dealership = new Dealership("Test Dealership", "123 Test St", "555-555-5555");
        Vehicle vehicle = new Vehicle(1, 2020, "Test Make", "Test Model", "Test Type", "Test Color", 1000, 10000.00);
        dealership.addVehicle(vehicle);

        // act
        dealership.removeVehicle(vehicle);

        // assert
        assertEquals(0, dealership.getInventory().size());
    }

    @Test
    void findVehiclesByColor_Should_ReturnVehicles_OfSameColor()
    {
        // arrange
        Dealership dealership = new Dealership("Test Dealership", "123 Test St", "555-555-5555");
        Vehicle vehicle1 = new Vehicle(1, 2020, "Test Make", "Test Model", "Test Type", "Test Color", 1000, 10000.00);
        Vehicle vehicle2 = new Vehicle(2, 2020, "Test Make", "Test Model", "Test Type", "Different Color", 1000, 10000.00);
        dealership.addVehicle(vehicle1);
        dealership.addVehicle(vehicle2);

        // act
        var vehicles = dealership.getVehiclesByColor("Test Color");

        // assert
        assertEquals(1, vehicles.size());
        assertTrue(vehicles.contains(vehicle1));
        assertFalse(vehicles.contains(vehicle2));
    }

    @Test
    void getVehicleById_Should_ReturnCorrectVehicle_When_IdExists() {
        // arrange
        Dealership dealership = new Dealership("Test Dealership", "123 Test St", "555-555-5555");
        Vehicle vehicle1 = new Vehicle(1, 2020, "Test Make", "Test Model", "Test Type", "Test Color", 1000, 10000.00);
        Vehicle vehicle2 = new Vehicle(2, 2020, "Test Make", "Test Model", "Test Type", "Different Color", 1000, 10000.00);
        dealership.addVehicle(vehicle1);
        dealership.addVehicle(vehicle2);

        // act
        Vehicle result = dealership.getVehicleById(1);

        // assert
        assertEquals(vehicle1, result);
    }

}