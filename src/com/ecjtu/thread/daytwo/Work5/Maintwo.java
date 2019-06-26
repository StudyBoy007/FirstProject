package com.ecjtu.thread.daytwo.Work5;

/**
 * Create by czq
 * time on 2019/6/26  20:51
 */
public class Maintwo {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Runabblee runabblee = new Runabblee("阿飞", atm);
        Runabblee runabblee1 = new Runabblee("阿昊", atm);
        new Thread(runabblee,"阿飞").start();
        new Thread(runabblee1,"阿昊").start();
    }
}
