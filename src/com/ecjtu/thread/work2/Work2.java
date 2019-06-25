package com.ecjtu.thread.work2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Create by czq
 * time on 2019/6/25  14:08
 */
public class Work2 extends Thread {
    @Override
    public void run() {
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss")));
        }
    }
}
