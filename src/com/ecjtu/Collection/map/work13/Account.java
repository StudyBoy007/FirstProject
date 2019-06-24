package com.ecjtu.Collection.map.work13;

/**
 * Create by czq
 * time on 2019/6/24  18:50
 */
public class Account {
    private int id;
    private double balance;
    private String password;
    public static int index;

    static {
        index = 1;
    }

    public Account(double balance, String password) {
        this.id = index++;
        this.balance = balance;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
