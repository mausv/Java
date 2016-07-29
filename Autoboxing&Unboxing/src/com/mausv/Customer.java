package com.mausv;

import java.util.ArrayList;

/**
 * Created by mausv on 2/23/2016.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    private Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void getTransactions() {
        for(int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i));
        }
    }

    public static Customer createCustomer(String customerName, Double initialTransaction) {
        Customer newCustomer = new Customer(customerName);
        newCustomer.addTransaction(Double.valueOf(initialTransaction).doubleValue());
        return newCustomer;
    }

    public void addTransaction(double newTransaction) {
        transactions.add(Double.valueOf(newTransaction));
    }

    public void printTransactions() {
        for(int i = 0; i < transactions.size(); i++) {
            System.out.println((i+1) + " - " + transactions.get(i).doubleValue());
        }
    }
}
