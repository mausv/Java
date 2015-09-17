package com.company;

/**
 * Created by Mauricio on 9/17/2015.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Default name", 50000.0, "default@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
