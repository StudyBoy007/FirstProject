package com.ecjtu.thread.daytwo.Test2;

/**
 * Create by czq
 * time on 2019/6/26  17:15
 */
public class Main extends Thread {
    private Object o = new Object();

    public Main(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized (o) {
            System.out.println(getName() + "我开始运行了");
            try {
                o.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("我成功输出了");

        }
    }

    public static void main(String[] args) {
        new Main("阿飞").start();
        new Main("阿昊").start();
    }

}
