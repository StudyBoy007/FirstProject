package com.ecjtu.thread.daytwo.work3;

/**
 * Create by czq
 * time on 2019/6/26  14:53
 */
public class userSave {
    public static void main(String[] args) {
        Bank bank = new Bank();
        new Thread(bank, "啊飞").start();
        new Thread(bank, "阿昊").start();
    }
}
