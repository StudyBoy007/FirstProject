package com.BigHomeWork.FirstHomeWork.Test1Bank.bean;

/**
 * Create by czq
 * time on 2019/5/31  15:12
 */
public class Account {
    protected double balance;

    public Account() {

    }

    public Account(double balance) {
        this.balance = balance;
//        System.out.println("Creating an account with a " + this.balance + " balance");
    }

    //获取余额
    public void getBalance() {
        System.out.println("The account has a balance of " + this.balance);
    }

    public String getBalance(Customer customer) {
        return "Customer [" + customer.getLastName() + "," + customer.getFirstName() +
                "] has a balance of " + this.balance;
    }

    //存款
    public void deposit(double money) {
        this.balance = this.balance + money;
        String newStr = "depposit " + money + "：" + true;
        System.out.println(newStr);
    }

    //取款
    public void withdraw(double money)  {
        boolean juify = true;
        String newStr = "";
        if (money < this.balance) {
            this.balance = this.balance - money;
            newStr = "withdraw " + money + "：" + juify;
//            System.out.println("withdraw " + money + "：" + juify);
        } else {
            juify = false;
            newStr = "withdraw " + money + "：" + juify;
//            System.out.println("withdraw " + money + "：" + juify);
        }
    }

}
