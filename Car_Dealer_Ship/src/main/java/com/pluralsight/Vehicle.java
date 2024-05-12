package com.pluralsight;

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
          return "Vehicle{" +
                  "year=" + year +
                  ", mileage=" + mileage +
                  ", make='" + make + '\'' +
                  ", model='" + model + '\'' +
                  ", color='" + color + '\'' +
                  ", type='" + type + '\'' +
                  ", price=" + price +
                  '}';
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

    // other methods...
}

