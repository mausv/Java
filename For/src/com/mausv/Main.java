package com.mausv;

public class Main {

    public static void main(String[] args) {
        for (int i = 8; i > 1; i--) {
            System.out.println(calculateInterest(10000, i));
        }

        int count = 0;

        for(int i = 10; i < 100; i++) {
            if(count >= 3) {
                break;
            }
            if(isPrime(i) == true) {
                System.out.println("Number " + i + " is a prime number.");
                count++;
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate/100.0));
    }
}
