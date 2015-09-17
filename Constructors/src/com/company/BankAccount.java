package com.company;

/**
 * Created by Mauricio on 9/17/2015.
 */
public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int phoneNumber;

    public BankAccount() {
        this(5789, 500, "Default name", "Default email", 8000);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double balance, String customerName,
                       String customerEmail, int phoneNumber) {
        System.out.println("Constructors with params called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, int phoneNumber) {
        this(9999, 100.55, customerName, customerEmail, phoneNumber);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds (double deposit) {
        this.balance += deposit;
        System.out.println("Deposited " + deposit);
    }

    public String withdrawFunds (double withdraw) {
        if(this.balance > withdraw) {
            this.balance -= withdraw;
            System.out.println("Withdrawn " + String.valueOf(withdraw));
            return "Withdrawn " + String.valueOf(withdraw);
        } else {
            System.out.println("Insufficient funds.");
            return "Insufficient funds.";
        }
    }

}
