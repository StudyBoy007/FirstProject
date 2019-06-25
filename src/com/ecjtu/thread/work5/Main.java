package com.ecjtu.thread.work5;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

/**
 * Create by czq
 * time on 2019/6/25  14:46
 */
public class Main {
    public static void main(String[] args) {
        Work5 work5 = new Work5();
        Thread thread = new Thread(work5,"new");
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "输出了" + (i + 1) + "次");
        }
    }
}
