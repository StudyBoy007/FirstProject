package com.ecjtu.thread.Test;

import java.util.concurrent.CountDownLatch;

/**
 * Create by czq
 * time on 2019/6/26  10:04
 */
public class My implements Runnable {
    private CountDownLatch cd;

    protected My(CountDownLatch cd) {
        this.cd = cd;
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                for (int i = 2; i < 1000; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + "获取的偶数为：" + i);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                cd.countDown();
            }
        }
    }
}
