package com.ecjtu.thread.work5;

/**
 * Create by czq
 * time on 2019/6/25  14:32
 */
public class Work5 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "输出了" + (i + 1) + "次");
        }
    }
}
