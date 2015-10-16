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
            System.out.println("Id: " + directory.get(i) + "Name: " + directory.get(i).getName() + " Phone: " + directory.get(i).getPhone());
        }
    }

    public String findContact(String name) {
        String phoneNumber = "Contact not found!";

        int pos = findContactPosition(name);

        if(pos != -1) {
            phoneNumber = directory.get(pos).getPhone();
        }

        return phoneNumber;
    }

    private int findContactPosition(String name) {
        int position = -1;

        for(int i = 0; i < directory.size(); i++) {
            if(name == directory.get(i).getName()) {
                position = i;
            }
        }

        return position;
    }
}
