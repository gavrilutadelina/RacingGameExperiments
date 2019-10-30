package com.fasttrackit;

public class RadioControlerCar extends AutoVehicle {

    public String toString(){
        return "Custom string representation";
    }

    public static final String CONTROL_TYPE = "radio_controlled";

    String color;
    int doorCount;

    public RadioControlerCar(Engine engine) {
        super(engine);
    }

    public RadioControlerCar() {
        this(new Engine());
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
