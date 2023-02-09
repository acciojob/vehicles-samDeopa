package com.driver;

public class Boat implements WaterVehicle {

    private String name="Sam";
    private int capacity=100 ;
    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
