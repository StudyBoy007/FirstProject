package com.ecjtu.JICheng.Work12;

/**
 * Create by czq
 * time on 2019/6/3  11:22
 */
public class Undergraduate extends Student {
    private String specialty;

    public Undergraduate(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }
    public void display(){
        System.out.println("姓名："+super.getName());
        System.out.println("年龄："+super.getAge());
        System.out.println("专业："+this.specialty);
    }
}
