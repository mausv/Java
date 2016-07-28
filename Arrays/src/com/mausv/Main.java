package com.mausv;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr;
        arr = getIntegers();
        arr = sortIntegers(arr);
        printArray(arr);
    }

    private static int[] getIntegers() {
        int[] integersArray = new int[5];

        for(int i = 0; i < integersArray.length; i++) {
            integersArray[i] = scan.nextInt();
        }

        return integersArray;
    }

    private static int[] sortIntegers(int[] array){

        int[] sortedArray = array.clone();
        boolean flag = true;

        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    int tempInteger = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = tempInteger;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
