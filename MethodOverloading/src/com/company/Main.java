package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("First Method " + calcFeetAndInchesToCentimeters(5,5));

        System.out.println("Overloading Method " + calcFeetAndInchesToCentimeters(60 + 10));


    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double centimeters = feet * 12;
            centimeters += inches;
            centimeters = centimeters * 2.54;

            return centimeters;
        }

        return -1;

    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if(inches >= 0) {
            double feet = inches / 12;
            return calcFeetAndInchesToCentimeters(feet,0);
        }

        return -1;
    }
}
