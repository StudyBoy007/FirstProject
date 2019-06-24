package com.ecjtu.JICheng.Work8;

/**
 * Create by czq
 * time on 2019/6/3  14:10
 */
public class Auto {
    private int tireNumber;
    private String color;
    private double weight;
    private double speed;

    public Auto() {
    }

    public Auto(int tireNumber, String color, double weight, double speed) {
        this.tireNumber = tireNumber;
        this.color = color;
        this.weight = weight;
        this.speed = speed;
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


    public void addSpeed(double speed){
        this.speed=this.speed+speed;
    }

    public void deleteSpeed(double speed){
        this.speed=this.speed-speed;
        if(this.speed==0){
            System.out.println("车停下来了");
        }
    }

    public void stopSpeed(){
        this.speed=0;
    }

}
