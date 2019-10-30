package com.fasttrackit;

public class AutoVehicle extends Vehicle {
    private Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
        System.out.println("Custom constructor invoked.");
    }

    public AutoVehicle(Engine engine, String name) {
        this.engine = engine;
        super.setName(name);
    }

    public AutoVehicle(){
        this(new Engine());
    }

    private String name;
    private int wheelCount;
    private String fuel;
    private int fuelConsumption;
    private int numberOfSeats;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getWheelCount() {
        return wheelCount;
    }

    @Override
    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
