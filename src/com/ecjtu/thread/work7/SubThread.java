package com.ecjtu.thread.work7;

/**
 * Create by czq
 * time on 2019/6/25  15:02
 */
public class SubThread extends Thread {
    public SubThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int sleepTime = ((int) (Math.random() * 10)) * 1000;
        System.out.println(getName() + "开始启动--->开始休眠:" + sleepTime + "秒");
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + ":休眠结束~");
    }
}
