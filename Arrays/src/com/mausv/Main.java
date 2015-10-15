package com.mausv;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = new int[5];

        myIntArray = getValues(myIntArray);

        myIntArray = sortArray(myIntArray);

        printArray(myIntArray);

    }

    public static int[] getValues(int[] array) {
        int[] valueArray = new int[array.length];

        System.out.println("Enter 5 values: ");

        for(int i = 0; i < array.length; i++) {
            valueArray[i] = scan.nextInt();
        }

        return valueArray;
    }

    public static int[] sortArray(int[] array) {
        /*int[] sortedArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            sortedArray[i] = array[i];
        }*/

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
