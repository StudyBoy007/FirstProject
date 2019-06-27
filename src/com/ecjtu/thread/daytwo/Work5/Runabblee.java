package com.ecjtu.thread.daytwo.Work5;

/**
 * Create by czq
 * time on 2019/6/26  20:51
 */
public class Runabblee implements Runnable {
    private String name;
    private ATM atm;

    public Runabblee(String name, ATM atm) {
        this.name = name;
        this.atm = atm;
    }

    @Override
    public void run() {
        synchronized (atm) {
            if ("阿飞".equals(name)) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                atm.LookMoney(); //这里通过atm这个对象调用了2个他的synchronized方法，虽然在执行第一个方法的时候会把方法中的内容全部执行完成，
                //，且不会被第二个线程接入，但是后面这个方法执行就有可能不会接着前面方法执行，因为还有一个线程在等待，可能会取执行
                //其他线程要执行的语句，因为在这里没有对象锁，所有线程是可以并发的，只有atm中的方法才会让线程串行输出
                atm.addMoney(100);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                atm.LookMoney();
            }
            if ("阿昊".equals(name)) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (atm.getTotalMoney() > 50) {
                    atm.SubMoney(50);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    atm.LookMoney();
                } else {
                    try {
                        throw new Exception("ATM余额不足");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
