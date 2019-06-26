package com.ecjtu.thread.daytwo.work4;

/**
 * Create by czq
 * time on 2019/6/26  15:31
 */
public class Test {
    public static void main(String[] args) {
        Object o = new Object();
        Thread thread = new Thread();
        new SubThread("阿昊", 1, 1000, o).start();
        new SubThread("阿昊", 1000, 2000, o).start();
        new SubThread("阿球", 2000, 3000, o).start();
    }
}
