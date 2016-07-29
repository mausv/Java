package com.mausv;

import java.util.ArrayList;

/**
 * Created by mausv on 2/23/2016.
 */
public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    private Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public Branch getBranch(String branchName) {
        return findBranch(branchName);
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    private Branch findBranch(String branchName) {
        for(int i = 0; i < branches.size(); i++) {
            if(branches.get(i).getName().equals(branchName)) {
                return branches.get(i);
            }
        }
        return null;
    }

    public static Bank createBank(String bankName) {
        return new Bank(bankName);
    }

    public void createBranch(String branchName) {
        branches.add(Branch.createBranch(branchName));
    }
}
