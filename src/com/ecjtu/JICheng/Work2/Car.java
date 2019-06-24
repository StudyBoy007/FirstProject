package com.ecjtu.JICheng.Work2;

/**
 * Create by czq
 * time on 2019/6/3  17:20
 */
public class Car extends Vehicle {
    private int seatNumber;

    public Car(String brand, String color, int seatNumber) {
        super(brand, color);
        this.seatNumber = seatNumber;
    }

    @Override
    public void showinfo() {
        System.out.println("牌子："+getBrand()+"\n"+"颜色："+getColor()+"\n"+"座位数量："+this.seatNumber+"个");
    }
}
