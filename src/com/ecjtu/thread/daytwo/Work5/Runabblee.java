package com.ecjtu.thread.daytwo.Work5;

/**
 * Create by czq
 * time on 2019/6/26  20:51
 */
public class Runabblee implements Runnable {
    private String name;
    private ATM atm;

    public Runabblee(String name, ATM atm) {
        this.name = name;
        this.atm = atm;
    }

    @Override
    public void run() {
        synchronized (atm) {
            if ("阿飞".equals(name)) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                atm.LookMoney();
                atm.addMoney(100);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                atm.LookMoney();
            }
            if ("阿昊".equals(name)) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (atm.getTotalMoney() > 50) {
                    atm.SubMoney(50);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    atm.LookMoney();
                } else {
                    try {
                        throw new Exception("ATM余额不足");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
