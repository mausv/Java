package com.mausv;

import java.util.Scanner;

public class Main {

    public static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
	    int x = 0;

        System.out.println("Number = ");
        x = Main.x.nextInt();

        calculateTable(x);
    }

    public static void calculateTable(int num) {
        for(int x = 0; x <= 12; x++) {
            System.out.println(x*num);
        }
    }
}
