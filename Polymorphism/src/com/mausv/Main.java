package com.mausv;

class Car {
    private String name;
    private String engine;
    private int cylinders;
    private int wheels;
    private int doors;

    public Car(String name, int cylinders, int doors) {
        this.name = name;
        this.cylinders = cylinders;
        this.doors = doors;
        this.wheels = 4;
    }

    public void startCar() {
        System.out.println("Starting car");
    }

    public void accelerate() {
        System.out.println("Accelerating car");
    }

    public void brake() {
        System.out.println("Stopping car");
    }
}

class Mercedes extends Car {
    public Mercedes(int cylinders, int doors) {
        super("Mercedes", cylinders, doors);
    }

    @Override
    public void startCar() {
        System.out.println("Starting Mercedes");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Mercedes");
    }

    @Override
    public void brake() {
        System.out.println("Stopping Mercedes");
    }
}

class Ferrari extends Car {
    public Ferrari(int cylinders, int doors) {
        super("Ferrari", cylinders, doors);
    }

    @Override
    public void startCar() {
        System.out.println(getClass().getSimpleName() + " starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Ferrari");
    }

    @Override
    public void brake() {
        System.out.println("Stopping Ferrari");
    }
}

public class Main {

    public static void main(String[] args) {

        Ferrari myFerrari = new Ferrari(8, 2);
        myFerrari.startCar();
        myFerrari.accelerate();
        myFerrari.brake();
    }
}
