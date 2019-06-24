package com.BigHomeWork.FirstHomeWork.Test1Bank.bean;

/**
 * Create by czq
 * time on 2019/5/31  15:30
 */
public class Customer {
    private Account checkingaccount;
    private Account savingaccount;
    private String firstName;
    private String LastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.LastName = lastName;
//        System.out.println("Creating the customer "+firstName+" "+lastName);
    }


    public Account getCheckingaccount() {
        return checkingaccount;
    }

    public void setCheckingaccount(Account checkingaccount) {
        this.checkingaccount = checkingaccount;
    }

    public Account getSavingaccount() {
        return savingaccount;
    }

    public void setSavingaccount(Account savingaccount) {
        this.savingaccount = savingaccount;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return LastName;
    }
}
