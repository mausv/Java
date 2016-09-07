package com.mausv.math;

/**
 * Created by mausv on 9/7/2016.
 */
public class Series {
    public static int nSum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
    public static int factorial(int n) {
        int num = 1;
        for (int i = 1; i < n; i++) {
            num *= i;
        }
        return num;
    }
    public static int fibonacci(int n) {
        return (n-1) + (n-2);
    }
}
