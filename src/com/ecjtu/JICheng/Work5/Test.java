package com.ecjtu.JICheng.Work5;

/**
 * Create by czq
 * time on 2019/6/3  18:58
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car(4, "blue", 10);
        System.out.println("开始车速为："+car.getSpeed());
        car.addSpeed(50);
        car.deleteSpeed(20);
    }
}
