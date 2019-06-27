package com.ecjtu.thread.daytwo.Test2;

/**
 * Create by czq
 * time on 2019/6/26  21:43
 */
public class Main2 {
    private static Object waitTestObject = new Object();

    public static void main(String[] args) {
        Thread sThread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (waitTestObject) {
                    //wait方法调用完后，synchronized的锁就释放了，不再持有锁。线程也开始等待，不再继续执行，需要一个notify方法或者notifyAll
                    try {
                        System.out.println(111);
                        waitTestObject.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "===================");
                }
            }
        }, "Thread1");
        sThread.start();


        Thread sThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (waitTestObject) {
                    //调用该方法后，如果只有一个wait的waitTestObject，则那个wait的线程可以竞争锁来重新执行，如果有多个，则在队列第一个的会被提醒，其他仍然是wait，感兴趣的可以试试。
                    waitTestObject.notify();
                    System.out.println(Thread.currentThread().getName() + "===================");
                }
            }
        }, "Thread2");
        sThread1.start();
    }
}
