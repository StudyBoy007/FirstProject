package com.ecjtu.JICheng.Work8;

/**
 * Create by czq
 * time on 2019/6/3  14:22
 */
public class Car extends Auto {
    private String conditioning;
    private String CD;

    public Car(int tireNumber, String color, double weight, double speed, String conditioning, String CD) {
        super(tireNumber, color, weight, speed);
        this.conditioning = conditioning;
        this.CD = CD;
    }

    @Override
    public void addSpeed(double speed) {
        super.addSpeed(speed);
        System.out.println("加速"+speed+"后车子的速度为："+super.getSpeed());
    }

    @Override
    public void deleteSpeed(double speed) {
        super.deleteSpeed(speed);
        System.out.println("减速"+speed+"后车子的速度为："+super.getSpeed());
    }

    @Override
    public void stopSpeed() {
        super.stopSpeed();
        System.out.println("车子速度降为0,停下来了");
    }

    public String getConditioning() {
        return conditioning;
    }

    public void setConditioning(String conditioning) {
        this.conditioning = conditioning;
    }

    public String getCD() {
        return CD;
    }

    public void setCD(String CD) {
        this.CD = CD;
    }
}
