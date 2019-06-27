package com.ecjtu.thread.daytwo.Test2;

/**
 * Create by czq
 * time on 2019/6/26  17:15
 */
public class Main extends Thread {

    //Main.class
    static synchronized void test(){

    }

//    this
    synchronized void test1(){

    }

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Runnable runnable = () -> {
            synchronized (Main2.class) {
                System.out.println("4444444444444444");
                if (Thread.currentThread().getName().equals("阿飞")) {
                    try {
                        System.out.println("11111111111111");
                        System.out.println("222222222222222");
                        System.out.println("333333333333333");
                        Main2.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "我开始运行了");
                }
                if (Thread.currentThread().getName().equals("阿昊")) {
                    System.out.println(Thread.currentThread().getName() + "我开始运行了");
                    Main2.class.notify();
                }
            }
        };

        new Thread(runnable, "阿飞").start();
        new Thread(runnable, "阿昊").start();
    }

}
