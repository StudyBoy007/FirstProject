package com.ecjtu.thread.daytwo.Work5;

/**
 * Create by czq
 * time on 2019/6/26  19:56
 */
public class ATM extends Thread {
    private int totalMoney = 0;

    public ATM(String name, int totalMoney) {
        super(name);
    }

    @Override
    public void run() {

    }
}
