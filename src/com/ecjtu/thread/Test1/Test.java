package com.ecjtu.thread.Test1;

/**
 * Create by czq
 * time on 2019/6/26  10:59
 */
public class Test {

    private static String[] flag = {"A"};

    static class AThread extends Thread {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            int i = 0;
            while (i < 10) {
                synchronized (flag) {
                    if (flag[0].equals("A")) {
                        System.out.print("A");
                        flag[0] = "B";

                        i++;
                    }
                    flag.notify();
                    try {
                        flag.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    static class BThread extends Thread {
        @Override
        public void run() {
            // TODO Auto-generated method stub
            int i = 0;
            while (i < 10) {
                synchronized (flag) {
                    if (flag[0].equals("B")) {
                        System.out.print("B");
                        flag[0] = "C";
                        i++;
                    }
                    flag.notify();
                    try {
                        flag.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class CThread extends Thread {
        @Override
        public void run() {
            // TODO Auto-generated method stub
            int i = 0;
            while (i < 10) {
                synchronized (flag) {
                    if (flag[0].equals("C")) {
                        System.out.println("C");
                        flag[0] = "A";
                        i++;
                    }
                    flag.notify();
                    try {
                        flag.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AThread thread1 = new AThread();
        BThread thread2 = new BThread();
        CThread thread3 = new CThread();
        thread1.start();
        thread2.start();
        thread3.start();
    }

}