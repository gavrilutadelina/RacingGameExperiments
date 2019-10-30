package com.fasttrackit;

public class Vehicle {

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", wheelCount=" + wheelCount +
                ", mileage=" + mileage +
                '}';
    }

    private String name;

    public void setName(String name) {
        this.name = name.trim();
    }

    private String color;
    private int wheelCount;
    private double mileage;
    private double fuelLevel;
    private double currentSpeed;

    public double accelerate(double speed) {
        currentSpeed += speed;

        // for simplicity, considering the duration to be 1 minute
        double distance = currentSpeed / 60;

        // mileage is represented as liters per 100 km
        double spentFuel = mileage * distance / 100;

        fuelLevel -= spentFuel;
        return distance;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
