package com.mausv;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double pounds = 126d;
        double poundsToKilograms = pounds * 0.45359237d;

        System.out.println(pounds + " pounds = " + poundsToKilograms + " kilograms.");

        double pi = 300_00_0.141_59_7d;

        System.out.println(pi);
    }
}
