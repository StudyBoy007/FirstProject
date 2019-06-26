package com.ecjtu.thread.daytwo.work4;

/**
 * Create by czq
 * time on 2019/6/26  15:58
 */
public class SubThread extends Thread {
    private int start;
    private int end;
    private Object o;

    public SubThread(String name, int start, int end, Object o) {
        super(name);
        this.start = start;
        this.end = end;
        this.o = o;
    }

    @Override
    public void run() {
        synchronized (o) {
            System.out.print(start + "~" + end + "之间的素数有：");
            for (int i = start; i < end; i++) {
                int x = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        x++;
                    }
                }
                if (x == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
