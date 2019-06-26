package com.ecjtu.thread.Test1;

/**
 * Create by czq
 * time on 2019/6/26  11:08
 */
public class ABCRunnable implements Runnable {
    private int num = 10;
    private char aChar = 'A';
    private Object a = new Object();

    @Override
    public void run() {
        synchronized (a) {
            while (num > 0) {
                if (aChar == 'A') {
                    System.out.print("A");
                    aChar = 'B';
                    a.notify();
                    try {
                        a.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (aChar == 'B') {
                    System.out.print("B");
                    aChar = 'C';
                    a.notify();
                    try {
                        a.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (aChar == 'C') {
                    System.out.print("C");
                    aChar = 'A';
                    num--;
                    System.out.println();
                    a.notify();
                    try {
                        a.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
