package com.mausv;

/**
 * Created by Mauricio on 10/8/2015.
 */
public class Bed {
    private int pillows;
    private Dimensions dimensions;
    private String color;

    public Bed(int pillows, Dimensions dimensions, String color) {
        this.pillows = pillows;
        this.dimensions = dimensions;
        this.color = color;
    }

    public void goToSleep() {
        System.out.println("You're going to sleep.");
    }

    public void wakeUp() {
        System.out.println("You're waking up.");
    }
}
