package com.ecjtu.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Create by czq
 * time on 2019/6/25  10:04
 */
public class ticketRunnable implements Runnable {
    private int tickNum = 5;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
//        synchronized (this) {
        try {
            while (tickNum > 0) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "卖出了第" + tickNum-- + "张票");
            }
            System.out.println(Thread.currentThread().getName() + ":票卖完啦~");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
//        }
    }
}
