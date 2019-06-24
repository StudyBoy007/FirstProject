package com.ecjtu.JICheng.Work2;

/**
 * Create by czq
 * time on 2019/6/3  17:17
 */
public class Vehicle {
    private String brand;
    private String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void run(){
        System.out.println("我已经开动了");
    }
    public void showinfo(){
        System.out.println("牌子："+this.brand+"\n"+"颜色："+this.color);
    }
}
