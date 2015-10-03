package com.mausv;

/**
 * Created by Mauricio on 9/27/2015.
 */
public class C300 extends Car{

    private String brand;
    private String color;
    private String fuelType;

    public C300(int wheels, int steeringWheel, int mirrors, int light, int handSteering, int changingGears, int increasingSpeed, int speed, String color, String fuelType) {
        super(wheels, steeringWheel, mirrors, light, handSteering, changingGears, increasingSpeed, speed);
        this.brand = "Chrysler";
        this.color = color;
        this.fuelType = fuelType;
    }

    public void topSpeed() {
        accelerate();
    }
}
