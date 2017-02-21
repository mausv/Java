package com.mausv;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by mausv on 2/21/2017.
 */
public class Example {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform division");
        }
    }

    private static int divide() {
        int x, y;
//        try {
        x = getInt();
        y = getInt();
        System.out.println("X is " + x + ", Y is " + y);
        return x / y;
//        } catch (NoSuchElementException e) {
//            throw new ArithmeticException("No suitable input");
//        } catch (ArithmeticException e) {
//            throw new ArithmeticException("Attempt to divide by zero");
//        }
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        while(true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                // go round again. Read past the end of line in the input first
                s.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9");
            }
        }
    }
}