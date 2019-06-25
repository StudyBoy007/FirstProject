package com.ecjtu.thread.work7;

/**
 * Create by czq
 * time on 2019/6/25  15:01
 */
public class Work7 {
    public static void main(String[] args) {
        SubThread thread = new SubThread("阿飞线程");
        SubThread thread1 = new SubThread("阿昊线程");
        thread.start();
        thread1.start();
    }
}
