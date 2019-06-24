package com.ecjtu.JICheng.Work5;

/**
 * Create by czq
 * time on 2019/6/3  18:50
 */
public class Car {
    private int tireNumber;
    private String color;
    private double weight;
    private double speed;

    public Car(int tireNumber, String color, double weight) {
        this.tireNumber = tireNumber;
        this.color = color;
        this.weight = weight;
    }

    public Car() {
    }

    public int getTireNumber() {
        return tireNumber;
    }

    public void setTireNumber(int tireNumber) {
        this.tireNumber = tireNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void addSpeed(double speed) {
        this.speed=this.speed+speed;
        System.out.println("加速"+speed+"后车子的速度为："+this.speed);
    }

    public void deleteSpeed(double speed) {
        this.speed=this.speed-speed;
        System.out.println("减速"+speed+"后车子的速度为："+this.speed);
        if (this.speed<=0) {
            System.out.println("车子速度减为0了，停了下来！！");
        }
    }

}
