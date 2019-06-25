package com.ecjtu.thread.work1;

/**
 * Create by czq
 * time on 2019/6/25  11:30
 */
public class TestWork1 {
    public static void main(String[] args) {
        Work1 work1 = new Work1("阿飞线程");
        Work1 work2 = new Work1("阿昊线程");
        Work1 work3 = new Work1("阿球线程");
        work1.start();
        work2.start();
        work3.start();
    }
}
