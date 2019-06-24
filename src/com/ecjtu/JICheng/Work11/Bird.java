package com.ecjtu.JICheng.Work11;

/**
 * Create by czq
 * time on 2019/6/3  19:34
 */
public class Bird extends Animal {
    private int wings;

    public Bird(int eyes, int legs, int wings) {
        super(eyes, legs);
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
    public void fly(){
        System.out.println("我具有飞行的能力，flying.......");
    }
}
