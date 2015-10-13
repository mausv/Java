package com.mausv;

/**
 * Created by Mauricio on 10/13/2015.
 */
public class Printer {
    public String name;
    private int tonerLvl;
    private int numPagesPrinted;
    private String printerType;

    public Printer(String printerType) {
        this.tonerLvl = 100;
        this.numPagesPrinted = 0;
        this.printerType = printerType;
    }

    public void addToner (int toner) {
        if(toner > 0 && toner <= 100) {
            tonerLvl = toner;
            System.out.println("Replaced toner. Printer now hasa toner of " + tonerLvl);
        } else {
            System.out.println("You can't replace a higher quantity than a 100% or lower than 1%");
        }
    }

    public void print (int pages) {
        if(tonerLvl > 0) {
            if (printerType == "duplex") {
                if(pages % 2 == 0) {
                    numPagesPrinted = numPagesPrinted + (pages/2);
                    System.out.println("Printed " + pages/2 + " pages." );
                    tonerLvl -= pages;
                } else {
                    numPagesPrinted += pages + 1;
                    System.out.println("Printed " + ((pages/2) + 1) + " pages." );
                    tonerLvl -= pages;
                }
            } else {
                numPagesPrinted += pages;
                tonerLvl -= pages;
            }
        } else {
            System.out.println("You're out of toner. Replace now.");
        }
    }

    public int getToner() {
        return tonerLvl;
    }
}
