package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 5;
        int finishNumber = 20;
        int evenNumbers = 0;
        while (number < finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }


            System.out.println("Even number " + number);
            number++;


            evenNumbers++;
            if(evenNumbers >= 5) {
                break;
            }
        }
        System.out.println("Even numbers found: " + evenNumbers);
    }

    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
