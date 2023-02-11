package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
        currentSpeed=0;
        currentDirection=0;
    }

    public void steer(int direction){
        currentDirection = direction;
        //direction is in degrees, add it to the current direction
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void move(int speed, int direction){
        currentSpeed = speed;
        currentDirection = direction;
        //set the values of currentSpeed and currentDirection
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
        currentSpeed=0;
        System.out.println("stop method called - The vehicle is stopped");
    }
    public String getName() {
        return this.name;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public int getCurrentDirection() {
        return this.currentDirection;
    }

}
