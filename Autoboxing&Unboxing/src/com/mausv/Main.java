package com.mausv;

public class Main {

    public static void main(String[] args) {
	    Bank myBank = Bank.createBank("International Mauricio Bank, IMB");
        myBank.createBranch("Alpha");
        myBank.createBranch("Beta");
        Branch firstBranch = myBank.getBranch("Beta");
        Customer newCustomer = Customer.createCustomer("Mauricio", 150.0d);
        Customer newCustomer2 = Customer.createCustomer("Mauricio2", 150.0d);
        Customer anotherCustomer = Customer.createCustomer("Ivan", 275.0d);
        firstBranch.addCustomerToBranch(newCustomer);
        firstBranch.addCustomerToBranch(anotherCustomer);
        firstBranch.addTransactionToCustomer("Mauricio", 250.0d);
        System.out.println(firstBranch.getName());
        firstBranch.getListOfCustomers(-1);
        boolean added = firstBranch.addCustomerToBranch(newCustomer2);
        if(added) {
            System.out.println("Added user");
        }
    }
}
