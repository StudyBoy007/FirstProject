package com.ecjtu.JICheng.Work2;

/**
 * Create by czq
 * time on 2019/6/3  17:25
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car("大众", "蓝色", 4);
        car.showinfo();
        System.out.println("------------------------------------");
        Trunk trunk = new Trunk("红菱", "红色", 100);
        trunk.showinfo();

    }
}
