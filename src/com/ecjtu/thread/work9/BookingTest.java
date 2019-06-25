package com.ecjtu.thread.work9;

/**
 * Create by czq
 * time on 2019/6/25  16:45
 */
public class BookingTest implements Runnable {
    ClassBookClerk cbc;
    int num;

    public BookingTest(ClassBookClerk cbc, int num) {
        this.cbc = cbc;
        this.num = num;
        new Thread(this).start();
    }

    @Override
    public void run() {
        cbc.booking(num);
    }
}
