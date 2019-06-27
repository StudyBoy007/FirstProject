package com.ecjtu.thread.daytwo.Test2;

/**
 * Create by czq
 * time on 2019/6/26  22:01
 */
public class Main3 {
    static Object o=new Object();
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o){
                    System.out.println("3333333333333333333");
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("11111111111111");
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o){
                    o.notifyAll();
                    System.out.println("22222222222222222");
                }
            }
        }).start();
    }
}
