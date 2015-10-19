package com.mausv;

import java.util.ArrayList;

/**
 * Created by Mauricio on 10/16/2015.
 */
public class MobilePhone {
    private ArrayList<Contact> directory = new ArrayList<>();

    public void addContact (String name, String phone){
        Contact newContact = new Contact(name, phone);
        directory.add(newContact);
    }

    public void getContactList() {
        for(int i = 0; i < directory.size(); i++) {
            System.out.println("Id: " + (i + 1) + " Name: " + directory.get(i).getName() + " Phone: " + directory.get(i).getPhone());
        }
    }

    public void findContact(String name) {
        String phoneNumber = "Contact not found!";

        int pos = findContactPosition(name);

        if(pos != -1) {
            phoneNumber = directory.get(pos).getPhone();
        }

        System.out.println(phoneNumber);
    }

    public void removeContact(String name) {
        int pos = findContactPosition(name);

        if(pos != -1) {
            System.out.println("Removed " + directory.get(pos).getName());
            directory.remove(pos);
        }
    }

    public void updateContact(String name) {
        int pos = findContactPosition(name);

        if(pos != -1) {
            System.out.println("Do you want to edit..? " + " Name: " + directory.get(pos).getName() + " Phone: " + directory.get(pos).getPhone());
            String choice = Main.scanner.nextLine();
            if(choice.equals("yes")) {
                System.out.println("Enter new name, press enter and then new phone and enter again: ");
                directory.get(pos).setName(Main.scanner.nextLine());
                directory.get(pos).setPhone(Main.scanner.nextLine());
                System.out.println("Updated contact! New info: " + " Name: " + directory.get(pos).getName() + " Phone: " + directory.get(pos).getPhone());
            } else {
                System.out.println("Then it's a no. Going to main menu.");
            }
        } else {
            System.out.println("Contact doesn't exists.");
        }
    }

    private int findContactPosition(String name) {
        int position = -1;

        for(int i = 0; i < directory.size(); i++) {
            if(name.equals(directory.get(i).getName())) {
                position = i;
            }
        }

        return position;
    }
}
