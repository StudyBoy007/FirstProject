package com.BigHomeWork.FirstHomeWork.Test1Bank.bean;

/**
 * Create by czq
 * time on 2019/5/31  16:50
 */
public class CheckingAccount extends Account {
    private double overdraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance);
        this.overdraftProtection = overdraftProtection;
//        if (overdraftProtection > 0) {
//            System.out.println("Creating her Checking Account with a " + balance + "  and " + overdraftProtection + " in overdraft protection");
//        } else {
//            System.out.println("Creating her Checking Account with a " + balance + " and no overdraft protection.");
//        }
    }

    @Override
    public void withdraw(double money) {
        boolean juify = true;
        String newStr = "";
        if (overdraftProtection == 0) {
            if (money < this.balance ) {
                this.balance = this.balance - money;
                newStr = "withdraw " + money + "：" + true;
                System.out.println(newStr);
            } else {
                newStr = "withdraw " + money + "：" + false;
                System.out.println(newStr);
                throw new OverdraftException(money-this.balance,"no overdraft protection Deifcit:");
            }
        } else {
            if (money < this.balance + overdraftProtection) {
                this.balance = this.balance - money;
                newStr = "withdraw " + money + "：" + juify;
                System.out.println(newStr);
            } else {
                juify = false;
                newStr = "withdraw " + money + "：" + juify;
                System.out.println(newStr);
                this.balance=0;
                throw new OverdraftException(money, "Insufficient funds for overdraft protection Deifcit:");
            }
        }
    }

    @Override
    public String getBalance(Customer customer) {
        return " Checking Account：Current balance is " + this.balance;
    }
}
