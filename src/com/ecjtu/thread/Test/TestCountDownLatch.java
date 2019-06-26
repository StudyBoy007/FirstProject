package com.ecjtu.thread.Test;

import java.util.concurrent.CountDownLatch;

/**
 * Create by czq
 * time on 2019/6/26  10:01
 */
public class TestCountDownLatch {
    public static void main(String[] args) {
        CountDownLatch cd = new CountDownLatch(5);
        long start = System.currentTimeMillis();
        My my = new My(cd);
        for (long i = 0; i < cd.getCount(); i++) {
            new Thread(my).start();
        }
        System.out.println("我是输出1");
        try {
            cd.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我是输出2");
        long end = System.currentTimeMillis();
        System.out.println("共花费了"+(end-start)+"毫秒");
    }
}
