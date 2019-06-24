package com.BigHomeWork.FirstHomeWork.Test1Bank.bean;

/**
 * Create by czq
 * time on 2019/5/31  16:50
 */
public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
//        System.out.println("Creating her Savings Account with a " + balance + "  and " + (interestRate * 100) + "% interest");
    }

    @Override
    public String getBalance(Customer customer) {
        return " Saving Account：Caurrent balance is " + this.balance;
    }

}
