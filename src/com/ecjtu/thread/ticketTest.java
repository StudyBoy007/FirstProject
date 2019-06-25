package com.ecjtu.thread;

import javax.naming.Name;

/**
 * Create by czq
 * time on 2019/6/25  10:53
 */
public class ticketTest {
    public static void main(String[] args) {
        ticketRunnable ticketRunnable = new ticketRunnable();
        ticketRunnable ticketRunnable1 = new ticketRunnable();
        Thread thread = new Thread(ticketRunnable, "窗口一"); //如果两个线程中用了同一个runnable对象，那么runnable中得数据可以被这两个线程同步
        Thread thread1 = new Thread(ticketRunnable, "窗口二");
        thread.start();
        thread1.start();
    }
}
