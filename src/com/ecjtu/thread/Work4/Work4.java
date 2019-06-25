package com.ecjtu.thread.Work4;

/**
 * Create by czq
 * time on 2019/6/25  14:26
 */
public class Work4 extends Thread {
    @Override
    public void run() {
        int sleepTime = 0;
        for (int i = 0; i < 3; i++) {
            sleepTime = ((int) (Math.random() * 10)) * 1000;
            System.out.println("第" + (i + 1) + "次线程休眠了：" + (sleepTime / 1000) + "秒");
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("3次休眠完毕~");
    }
}
