package com.ecjtu.thread.Test1;

/**
 * Create by czq
 * time on 2019/6/26  11:02
 */
public class ABCThread {
    public static void main(String[] args) {
        ABCRunnable abcRunnable = new ABCRunnable();
        new Thread(abcRunnable,"A").start();
        new Thread(abcRunnable,"B").start();
        new Thread(abcRunnable,"C").start();
    }
}

