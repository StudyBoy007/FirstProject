package com.ecjtu.thread.work8;

/**
 * Create by czq
 * time on 2019/6/25  15:09
 */
public class SubThread extends Thread {
    private int time;

    public SubThread(String name, int time) {
        super(name);
        this.time = time;
    }

    @Override
    public void run() {
        System.out.println(getName() + ":线程开始启动~");
        while (time > 0) {
            System.out.println("当前剩余时间为：" + time);
            time -= 3;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + ":线程结束~");
    }
}
