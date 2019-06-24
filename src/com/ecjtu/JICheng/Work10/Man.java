package com.ecjtu.JICheng.Work10;

/**
 * Create by czq
 * time on 2019/6/3  16:12
 */
public class Man extends Human {
    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println(getName()+"喜欢打篮球！！");
    }
}
