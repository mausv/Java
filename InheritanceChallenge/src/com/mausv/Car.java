package com.mausv;

/**
 * Created by Mauricio on 9/18/2015.
 */
public class Car extends Vehicle {

    private int handSteering;
    private int changingGears;
    private int increasingSpeed;

    public Car(int wheels, int steeringWheel, int mirrors, int light, int speed, int handSteering, int changingGears, int increasingSpeed) {
        super(wheels, steeringWheel, mirrors, light, speed);
        this.handSteering = handSteering;
        this.changingGears = changingGears;
        this.increasingSpeed = increasingSpeed;
    }
}
