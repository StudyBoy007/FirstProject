package com.ecjtu.thread.daytwo.Test2;

public class AppleDemo {
    public static void main(String[] args) {

        ShareApple shareApple=new ShareApple();
        Thread child1=new Thread(shareApple);
        child1.setName("小明");
        Thread child2=new Thread(shareApple);
        child2.setName("小强");
        child1.start();;
        child2.start();

    }
}

class ShareApple implements Runnable{
    private int appleCount=5;
    private Boolean isRun=true;
    public synchronized boolean getApple(){
        if(appleCount==0)
            return false;
            appleCount--;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (appleCount >= 0) {
                System.out.println(Thread.currentThread().getName() +
                        "小朋友拿走一个苹果，还剩" + appleCount + "个苹果！");
            } else {
                System.out.println(Thread.currentThread().getName() + "发现苹果没了！");
            }

        return true;
    }
    @Override
    public void run() {
        while (isRun){
            isRun=getApple();
            Thread.yield();
        }
        if(appleCount<=0){
            System.out.println(Thread.currentThread().getName()+"的线程进入死亡状态");
            return;
        }
    }
}
