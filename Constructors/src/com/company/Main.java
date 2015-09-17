package com.company;

public class Main {

    public static void main(String[] args) {
       /* BankAccount bankAcc = new BankAccount();//5241898, 5000, "Mauricio", "mausv@me.com", 81815236);
        *//*bankAcc.setAccountNumber(5241898);
        bankAcc.setBalance(5000);
        bankAcc.setCustomerEmail("mausv@me.com");
        bankAcc.setPhoneNumber(818185236);
        bankAcc.setCustomerName("Mauricio");*//*

        System.out.println(bankAcc.getPhoneNumber());

        System.out.println(bankAcc.getCustomerName() + "'s balance: " + bankAcc.getBalance());

        bankAcc.depositFunds(400.45);

        System.out.println(bankAcc.getCustomerName() + "'s balance: " + bankAcc.getBalance());

        bankAcc.withdrawFunds(5500);

        System.out.println(bankAcc.getCustomerName() + "'s balance: " + bankAcc.getBalance());

        bankAcc.withdrawFunds(5235.64);

        System.out.println(bankAcc.getCustomerName() + "'s balance: " + bankAcc.getBalance());

        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", 1234567);

        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());*/

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Mauricio", 25000.0);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
    }
}
