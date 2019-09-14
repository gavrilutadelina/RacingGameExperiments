package com.fasttrackit;

/**
 * Hello world!
 *
 */
public class App { public static void main(String[] args ) {

        System.out.println( "Hello World!" );


        Engine daciaEngine = new Engine();
        daciaEngine.fuelConsumption=8;
        daciaEngine.maximumPower=85;
        daciaEngine.fuel="gasoline";
        daciaEngine.numberOfCylinders=4;

        AutoVehicle firstVehicle=new AutoVehicle();
        firstVehicle.name="Ford";
        firstVehicle.fuel="diesel";
        firstVehicle.fuelConsumption=7;
        firstVehicle.numberOfSeats=5;
        firstVehicle.numberOfWheels=4;
        firstVehicle.engine=daciaEngine;

        RadioControlerCar radioControlerCar=new RadioControlerCar();
        radioControlerCar.color="red";
        radioControlerCar.name="Toyota";
        radioControlerCar.numberOfSeats=6;
        radioControlerCar.wheelCount=4;

        Vehicle vehicle=new Vehicle();
        vehicle.name="BMW";
        vehicle.color="blue";
        vehicle.speed=240;
        vehicle.wheelCount=4;
    }
}
