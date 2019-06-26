package com.ecjtu.thread.daytwo.Work2;

/**
 * 题目：编写线程同步模拟应用程序：
 * (1) 大气环境数据为：温度，湿度，风速。
 * (2) 一个大气环境传感器测量环境数据需要5秒时间。
 * (3)一个计算机读取传感器的环境数据需要0.01秒时间。
 * 模拟一个计算机读取大气环境传感器的读取的随机的温度，湿度和风速的100次。
 *
 * @author yao 思路：实质就是一个生产者消费者问题，使用信号量来解决。
 * 定义两个信号量isReady(是否可读)和isreaded（是否已读），
 * 传感器监测isreaded，计算机监测isReady，
 * 使用读锁和写锁来控制计算机和传感器读写
 */
public class Main {
    public static Object writelock = new Object(); // 写锁
    public static Object readlock = new Object(); // 读锁
    public int temperature = 0; // 温度
    public int hamidity = 0; //湿度
    public int speed = 0; // 速度
    public boolean isReady = false; // 是否可读
    public boolean isreaded = true; // 是否可写
    //传感器线程
    class Sensor extends Thread {
        public void run() {
            try {
                getAtmosphereParameter();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //获取传感器的参数
        private void getAtmosphereParameter() throws InterruptedException {
            synchronized (writelock) {
                while (true) {
                    if (isreaded) {
                        System.out.println("传感器正在收集数据，请等待五秒钟");
                        this.sleep(5000);
                        //得到随机的温度
                        temperature = (int) (Math.random() * 100);
                        //得到随机的湿度
                        hamidity = (int) (Math.random() * 100);
                        //得到随机的风速
                        speed = (int) (Math.random() * 100);
                        //状态是可读
                        isReady = true;

                        isreaded = false;
                        System.out.println("传感器收集数据完毕");
                        synchronized (readlock) {
                            readlock.notifyAll();
                        }
                        //写锁等待
                        writelock.wait();
                    } else {
                        System.out.println("电脑正在读数据，传感器进入等待");
                        writelock.wait();
                    }
                }

            }

        }
    }
    //电脑线程
    class Computer extends Thread {
        @Override
        public void run() {
            try {
                readParameter();
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

        public void readParameter() throws InterruptedException {
            synchronized (readlock) {
                while (true) {
                    if (isReady) {
                        System.out.println("电脑正在读数据，请等待0.1秒钟");
                        this.sleep(100);
                        System.out.println("温度：" + temperature);
                        System.out.println("湿度：" + hamidity);
                        System.out.println("风速：" + speed);
                        isreaded = true;
                        isReady = false;
                        System.out.println("电脑读数据完毕");
                        synchronized (writelock) {
                            writelock.notifyAll();
                        }
                        readlock.wait();
                    } else {
                        System.out.println("传感器正在收集数据，电脑进入等待");
                        readlock.wait();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Computer computer = main.new Computer();
        Sensor sensor = main.new Sensor();
        computer.start();
        sensor.start();
    }
}
