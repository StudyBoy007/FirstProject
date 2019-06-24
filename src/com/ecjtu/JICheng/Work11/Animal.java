package com.ecjtu.JICheng.Work11;

/**
 * Create by czq
 * time on 2019/6/3  19:29
 */
public class Animal {
    private int eyes;
    private int legs;

    public Animal() {
    }

    public Animal(int eyes, int legs) {
        this.eyes = eyes;
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void run(){
        System.out.println("我具有奔跑的能力,running.......");
    }
    public void eat(){
        System.out.println("我具有进食的能力,eating.......");
    }
}
