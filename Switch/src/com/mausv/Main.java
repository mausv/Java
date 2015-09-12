package com.mausv;

public class Main {

    public static void main(String[] args) {
        char myChar = 'A';

        switch (myChar){
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("Letter found!");
                break;
            default:
                System.out.println("Nothing found");
                break;
        }
    }
}
