package com.ecjtu.thread.work9;

/**
 * Create by czq
 * time on 2019/6/25  16:47
 */
public class Test {
    public static void main(String[] args) {
        ClassBookClerk clerk = new ClassBookClerk();
        new BookingTest(clerk, 7);
        new BookingTest(clerk, 5);
    }
}
