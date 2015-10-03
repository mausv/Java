package com.mausv;

/**
 * Created by Mauricio on 9/18/2015.
 */
public class Vehicle {

    private int wheels;
    private int steeringWheel;
    private int mirrors;
    private int light;
    private int speed;

    public Vehicle(int wheels, int steeringWheel, int mirrors, int light, int speed) {
        this.wheels = wheels;
        this.steeringWheel = steeringWheel;
        this.mirrors = mirrors;
        this.light = light;
        this.speed = speed;
    }

    public void accelerate() {
        this.speed += 10;
    }
}
