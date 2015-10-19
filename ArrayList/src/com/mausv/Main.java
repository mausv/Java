package com.mausv;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static MobilePhone myPhone = new MobilePhone();

    public static void main(String[] args) {

        initializePhone();

    }

    public static void initializePhone() {
        printMenu();
        System.out.println("Choose an option: ");

        boolean flag = true;

        while(flag) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printMenu();
                    break;

                case 1:
                    System.out.println("Enter name, press enter and then the phone number: ");
                    myPhone.addContact(scanner.nextLine(), scanner.nextLine());
                    break;

                case 2:
                    System.out.println("Contacts: ");
                    myPhone.getContactList();
                    break;

                case 3:
                    System.out.println("Enter contact name: ");
                    myPhone.updateContact(scanner.nextLine());
                    break;

                case 4:
                    System.out.println("Remove contact: ");
                    myPhone.removeContact(scanner.nextLine());
                    break;

                case 5:
                    System.out.println("Contact name: ");
                    myPhone.findContact(scanner.nextLine());
                    break;

                case 9:
                    System.out.println("Exiting phone..");
                    flag = false;
                    break;

                default:
                    System.out.println("Wrong option");

            }
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
