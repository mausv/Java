package com.mausv;

public class Main {

    public static void main(String[] args) {
        Printer myPrinter = new Printer("duplex");
        myPrinter.name = "Brother";

        myPrinter.print(5);
        myPrinter.print(200);
        myPrinter.print(40);

        myPrinter.addToner(200);

        myPrinter.addToner(85);

        myPrinter.print(2);

        System.out.println("Toner: /*" + myPrinter.getToner());

    }
}
