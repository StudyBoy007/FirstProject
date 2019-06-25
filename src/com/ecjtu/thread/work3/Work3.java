package com.ecjtu.thread.work3;

/**
 * Create by czq
 * time on 2019/6/25  14:21
 */
public class Work3 extends Thread {
    private String threadName;
    private int sleepTime;

    public Work3(String threadName, int sleepTime) {
        super(threadName);
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        System.out.println("线程名为：" + getName() + ",休眠时间为：" + this.sleepTime);
        try {
            Thread.sleep(this.sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("休眠时间结束~");
    }
}
