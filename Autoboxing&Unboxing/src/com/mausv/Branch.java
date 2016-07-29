package com.mausv;

import java.util.ArrayList;

/**
 * Created by mausv on 7/29/2016.
 */
public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    private Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public static Branch createBranch(String branchName) {
        return new Branch(branchName);
    }

    public boolean addCustomerToBranch(Customer newCustomer) {
        boolean exists = findCustomer(newCustomer);
        if(exists) {
            return false;
        }
        customers.add(newCustomer);
        return true;
    }

    public void getListOfCustomers(int opt) {
        if(opt == -1) {
            for (int i = 0; i < customers.size(); i++) {
                System.out.println((i+1) + ". " + "C: " + customers.get(i).getName());
            }
            return;
        }
        customers.get(opt).getTransactions();
    }

    public boolean addTransactionToCustomer(String customerName, Double transactionAmount) {
        Customer customer = findCustomerObject(customerName);
        if(customer == null) {
            return false;
        }
        customer.addTransaction(transactionAmount);
        System.out.println(transactionAmount + " added to " + customer.getName());
        return true;
    }

    private boolean findCustomer(String customerName) {
        for(int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName().equals(customerName)) {
                return true;
            }
        }
        return false;
    }

    private Customer findCustomerObject(String customerName) {
        for(int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName().equals(customerName)) {
                return customers.get(i);
            }
        }
        return null;
    }

    private boolean findCustomer(Customer customer) {
        for(int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName().equals(customer.getName())) {
                return true;
            }
        }
        return false;
    }

}
