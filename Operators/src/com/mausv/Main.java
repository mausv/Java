package com.mausv;

public class Main {

    public static void main(String[] args) {
        double firstValue = 20d;
        double secondValue = 80d;

        double sum = (firstValue + secondValue) * 25;

        double remainder = sum % 2300d;

        if (remainder <= 200d)
            System.out.println("Total was over the limit");

    }
}
