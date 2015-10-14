package com.company;

public class Main {

    public static void main(String[] args) {

        HealthyBurger hB = new HealthyBurger("White", "Roastbeef", true, true, false, true, true, true);

        System.out.println(hB.currentPrice());

    }
}
