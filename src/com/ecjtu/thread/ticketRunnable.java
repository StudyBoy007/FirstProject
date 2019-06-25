package com.ecjtu.thread;

/**
 * Create by czq
 * time on 2019/6/25  10:04
 */
public class ticketRunnable implements Runnable {
    private int tickNum = 5;

    @Override
    public void run() {

        synchronized (this) {
            while (tickNum >0) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "卖出了第" + tickNum-- + "张票");
                Thread.yield();
            }
        }
    }
}
