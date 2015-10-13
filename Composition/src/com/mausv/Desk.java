package com.mausv;

/**
 * Created by Mauricio on 10/8/2015.
 */
public class Desk {
    private Dimensions dimensions;
    private String color;

    public Desk(Dimensions dimensions, String color) {
        this.dimensions = dimensions;
        this.color = color;
    }

    public void cleanDesk() {
        System.out.println("Cleaning desk.");
    }
}
