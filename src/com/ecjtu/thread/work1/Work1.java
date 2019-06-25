package com.ecjtu.thread.work1;

/**
 * Create by czq
 * time on 2019/6/25  11:25
 */
public class Work1 extends Thread {
    private int sleepTime;

    public Work1(String name) {
        super(name);
        this.sleepTime = ((int) (Math.random() * 10)) * 1000;
    }

    @Override
    public void run() {
        System.out.println(getName() + "开始运行,准备进入休眠,休眠时间为:" + this.sleepTime);
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + ":休眠完成~");
    }
}
