package com.fasttrackit;

/**
 * Hello world!
 *
 */
public class App { public static void main(String[] args ) {

        Vehicle vehicle=new RadioControlerCar();


        RadioControlerCar golf=new RadioControlerCar();
        golf.setName("Golf");
        RadioControlerCar skoda=new RadioControlerCar();
        skoda.setName("Skoda");
        System.out.println(golf.getName());
        System.out.println(skoda.getName());
        System.out.println(RadioControlerCar.CONTROL_TYPE);
        System.out.println("Control type referenced from golf object: "+ golf.CONTROL_TYPE);
        System.out.println("Control type referenced from skoda object: "+ skoda.CONTROL_TYPE);

        System.out.println(golf.toString());

        skoda.setName("Skoda Fabia");
//        System.out.println(golf.getName());
        System.out.println(skoda.getName());
        System.out.println(RadioControlerCar.CONTROL_TYPE);
        System.out.println("Control type referenced from golf object: "+ golf.CONTROL_TYPE);
        System.out.println("Control type referenced from skoda object: "+ skoda.CONTROL_TYPE);
        System.out.println("Changed values below.");

        RadioControlerCar firstCar=new RadioControlerCar();
        firstCar.setName("Lada");
        firstCar.setColor("Black");
        firstCar.setWheelCount(4);
        firstCar.setMileage(9.5);

        //Vehicle vehicle=new Vehicle();
        vehicle.accelerate(5.1);

        vehicle.setName("Ford");
        System.out.println(vehicle.toString());

        System.out.println( "Hello World!" );


//        Engine daciaEngine = new Engine();
//        daciaEngine.fuelConsumption=8;
//        daciaEngine.maximumPower=85;
//        daciaEngine.fuel="gasoline";
//        daciaEngine.numberOfCylinders=4;

//        AutoVehicle firstVehicle=new AutoVehicle();
//        firstVehicle.name="Ford";
//        firstVehicle.fuel="diesel";
//        firstVehicle.fuelConsumption=7;
//        firstVehicle.numberOfSeats=5;
//        firstVehicle.wheelCount=4;
//        firstVehicle.engine=daciaEngine;

//        RadioControlerCar radioControlerCar=new RadioControlerCar();
//        radioControlerCar.color="red";
//        radioControlerCar.name="Toyota";
//        radioControlerCar.numberOfSeats=6;
//        radioControlerCar.wheelCount=4;
//        radioControlerCar.doorCount=6;

    }
}
