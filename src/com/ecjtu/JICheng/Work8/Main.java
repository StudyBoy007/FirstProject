package com.ecjtu.JICheng.Work8;

/**
 * Create by czq
 * time on 2019/6/3  14:29
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, "blue", 200, 400, "格力", "周杰伦");
        System.out.println("车子的重量为："+car.getWeight());
        System.out.println("车子的轮胎个数为："+car.getTireNumber());
        System.out.println("车子的颜色为:"+car.getColor());
        System.out.println("车子的空调牌子为:"+car.getConditioning());
        System.out.println("车子的CD唱片为："+car.getCD());
        System.out.println("车子的速度为："+car.getSpeed());
        car.addSpeed(100);
        car.deleteSpeed(50);
        car.stopSpeed();
    }
}
