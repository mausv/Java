package com.mausv;

public class Main {

    public static void main(String[] args) {

        byte myByteVar = 2;

        short myShortVar = 24;

        int myIntVar = 1;

        long myLongTotal = 50000L + 10L * (myByteVar + myShortVar + myIntVar);
        short myShortTotal = (short) (1000 + 10 * (myByteVar + myShortVar + myIntVar));

        System.out.println(myLongTotal);
        System.out.println(myShortTotal);

    }
}
