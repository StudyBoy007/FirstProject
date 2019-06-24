package com.ecjtu.objectC.Test2;

/**
 * Create by czq
 * time on 2019/5/31  10:24
 */
public class Vehicle {
    public double speed;
    public double size;

    public void move(){
        System.out.println("我可以移动,我的速度为："+speed);
    }

    public void setSpeed(double speed){
        this.speed=speed;
    }
    public void setSize(double size){
        this.size=size;
    }

    public void speedUp(double speed){
        this.speed=this.speed+speed;
        move();
    }

    public void speedsDown(double speed){
        this.speed=this.speed-speed;
        move();
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.setSize(5);
        car.setSpeed(100);
        car.move();
        car.speedUp(50);
        car.speedsDown(100);
    }
}
