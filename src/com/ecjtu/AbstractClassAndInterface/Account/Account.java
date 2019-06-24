package com.ecjtu.AbstractClassAndInterface.Account;

/**
 * Create by czq
 * time on 2019/6/4  9:39
 */
public class Account {
    private int id;
    private String pwd;
    private double balance;
    private static double rate;
    private static int min_balance;
    private static int total;

    static {

        //静态代码块给静态变量赋初值
        total = 1000;
        min_balance = 1000;
        rate = 0.09;
    }

    public Account(String pwd, double balance) {
        id = total++;
        this.pwd = pwd;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public static int getMin_balance() {
        return min_balance;
    }

    public static void setMin_balance(int min_balance) {
        Account.min_balance = min_balance;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Account.total = total;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance + ",rate=" + rate + ",min_balance=" + min_balance +
                '}';
    }
}
