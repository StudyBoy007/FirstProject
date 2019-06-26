package com.ecjtu.thread.daytwo.Work5;

/**
 * Create by czq
 * time on 2019/6/26  19:56
 */
public class ATM {
    private volatile int totalMoney = 200;

    public void addMoney(int i) {
        System.out.println(Thread.currentThread().getName() + "存了" + i + "元");
        totalMoney += i;
    }

    public void SubMoney(int i) {
        System.out.println(Thread.currentThread().getName() + "取了" + i + "元");
        totalMoney -= i;

    }

    public void LookMoney() {
        System.out.println("银行中余额为：" + totalMoney + "元");
    }

    public int getTotalMoney() {
        return totalMoney;
    }
}
