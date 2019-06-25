package com.ecjtu.thread.work6;

/**
 * Create by czq
 * time on 2019/6/25  14:50
 */
public class Work6 implements Runnable {
    public static void main(String[] args) {
        Work6 work6 = new Work6();
        Thread thread = new Thread(work6, "阿飞线程");
        thread.start();//线程调用了start方法
    }

    @Override
    public void run() {
        System.out.println("running.....");
    }

    void start(int i) {
    }

    void go() {
        start(1);
    }
}
