package com.company;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a a string";
        System.out.println("myString is = " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is = " + myString);
        myString = myString + ". \u00A9 2015";
        System.out.println("myString is = " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 10;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 250.14;
        lastString = lastString + doubleNumber;
        System.out.println("LS value: " + lastString);

    }
}
