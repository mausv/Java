package com.mausv;

/**
 * Created by mausv on 9/3/2016.
 */
public abstract class Bird extends Animal implements Flyable{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }


    @Override
    public void fly() {
        System.out.println(getName() + " is flitting it's wings");
    }
}
