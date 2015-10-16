package com.mausv;

/**
 * Created by Mauricio on 10/16/2015.
 */
public class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return phone;
    }
}
