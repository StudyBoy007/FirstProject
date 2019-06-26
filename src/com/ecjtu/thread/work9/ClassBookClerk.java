package com.ecjtu.thread.work9;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Create by czq
 * time on 2019/6/25  16:40
 */
public class ClassBookClerk {
    int remainder = 10;
    Lock lock = new ReentrantLock();

    //1.0
//    synchronized void booking(int num) {
//        if (num < remainder) {
//            System.out.println("预定" + num + "张");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            remainder = remainder - num;
//        } else {
//            System.out.println("票数余额不够，无法预定！");
//        }
//        System.out.println("还剩" + remainder + "张票");
//    }

    //2.0
    synchronized void booking(int num) {
        try {
            lock.lock();
            if (num < remainder) {
                System.out.println("预定" + num + "张");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                remainder = remainder - num;
            } else {
                System.out.println("票数余额不够，无法预定！");
            }
            System.out.println("还剩" + remainder + "张票");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();//一定要写在finally中
        }
    }
}
