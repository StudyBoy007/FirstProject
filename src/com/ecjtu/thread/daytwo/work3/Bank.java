package com.ecjtu.thread.daytwo.work3;

/**
 * Create by czq
 * time on 2019/6/26  14:43
 */
public class Bank implements Runnable {
    private double moneyTotal = 0;

    @Override
    public void run() {
//        for (int i = 0; i < 3; i++) {
//            synchronized (this) {
////                System.out.println("sometime");//不加这就会出现锁粗化的问题
//                System.out.print(Thread.currentThread().getName() + ":存了100块钱,");
//                moneyTotal += 100;
//                System.out.println("目前银行的汇款总额为：" + moneyTotal);
//            }
//        }

//        synchronized (this) {
//            for (int i = 0; i < 3; i++) {
//                System.out.print(Thread.currentThread().getName() + ":存了100块钱,");
//                moneyTotal += 100;
//                System.out.println("目前银行的汇款总额为：" + moneyTotal);
//            }
//        }
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            withdraw();
            Thread.yield();//yield不会释放锁资源
        }
    }

    public synchronized void withdraw() {
        System.out.print(Thread.currentThread().getName() + ":存了100块钱,");
        moneyTotal += 100;
        System.out.println("目前银行的汇款总额为：" + moneyTotal);
    }
}
