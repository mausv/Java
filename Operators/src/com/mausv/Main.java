package com.mausv;

public class Main {

    public static void main(String[] args) {
        double firstValue = 20d;
        double secondValue = 80d;

        double sum = (firstValue + secondValue) * 25;

        double remainder = sum % 40d;

        if (remainder <= 20d)
            System.out.println("Total was over the limit");

    }
}
