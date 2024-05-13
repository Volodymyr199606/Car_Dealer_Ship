package com.pluralsight.Model;

public class Vehicle {
    private int id;
    private int year;
    private String make;
    private String model;
    private String type;
    private String color;
    private int mileage;
    private double price;

    public Vehicle(int id, int year, String make, String model, String type, String color, int mileage, double price) {
        this.id = id;
        this.year = year;
        this.make = make;
        this.model = model;
        this.type = type;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
    }

    @Override
    public String toString() {
        String colorCode;
        switch (type.toLowerCase()) {
            case "suv":
                colorCode = "\u001B[31m"; // Red
                break;
            case "sedan":
                colorCode = "\u001B[32m"; // Green
                break;
            case "truck":
                colorCode = "\u001B[34m"; // Blue
                break;
            default:
                colorCode = "\u001B[0m"; // Reset
                break;
        }

        return colorCode + "Vehicle " +
                "Year = " + year +
                ", Mileage = " + mileage +
                ", Make = '" + make + '\'' +
                ", Model = '" + model + '\'' +
                ", Color = '" + color + '\'' +
                ", Type = '" + type + '\'' +
                ", Price = " + price +
                '.' + "\u001B[0m"; // Reset color
    }

    public double getPrice() {
        return this.price;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public String getColor() {
        return this.color;
    }

    public int getMileage() {
        return this.mileage;
    }

    public String getType() {
        return this.type;
    }

    public int getId() {
        return this.id;
    }


}

