package com.mausv;

/**
 * Created by mausv on 9/3/2016.
 */
public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not good at that");
    }
}
