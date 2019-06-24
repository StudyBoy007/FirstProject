package com.ecjtu.AbstractClassAndInterface.Water;

/**
 * Create by czq
 * time on 2019/6/4  15:39
 */
public class Water1 extends Water implements Buffer, Filter, Heating, Sugar {

    @Override
    public void water() {
        System.out.println("水取了出来，准备进行加工为纯净水");
    }
    public void start(){
        buffer();
    }

    @Override
    public void buffer() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("该水已经被缓冲");
        filter();
    }

    @Override
    public void filter() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("该水已经被过滤");
        heat();
    }

    @Override
    public void heat() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("该水已经被加热");
        addSugar();
    }

    @Override
    public void addSugar() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("该水已经被加糖");
    }
}
