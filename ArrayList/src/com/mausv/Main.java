package com.mausv;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone();
        myPhone.addContact("Mauricio", "8181852368");
        myPhone.addContact("Rodolfo", "8181852365");
        myPhone.getContactList();

        System.out.println(myPhone.findContact("Mauricio"));

        initializePhone();

    }

    public static void initializePhone() {
        printMenu();
        System.out.println("Choose an option: ");

        switch(scanner.nextInt()) {
            case 0:
                printMenu();
                break;

            case 1:
                System.out.println("Add contact");
                break;

            case 2:
                System.out.println("Print contact list");
                break;

            case 3:
                System.out.println("Update contact");
                break;

            case 4:
                System.out.println("Remove contact");
                break;

            case 5:
                System.out.println("Search contact");
                break;

            case 9:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Wrong option");


        }
    }

    public static void printMenu() {
        System.out.println("Options: \n" +
                "\t 0 - Menu \n" +
                "\t 1 - Add contact \n" +
                "\t 2 - Print contact list \n" +
                "\t 3 - Update contact \n" +
                "\t 4 - Remove contact \n" +
                "\t 5 - Search contact \n" +
                "\t 9 - Exit");
    }
}
