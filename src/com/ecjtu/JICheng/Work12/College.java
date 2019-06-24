package com.ecjtu.JICheng.Work12;

/**
 * Create by czq
 * time on 2019/6/3  11:22
 */
public class College extends Student {
    private String school;

    public College(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }
    public void display(){
        System.out.println("姓名："+super.getName());
        System.out.println("年龄："+super.getAge());
        System.out.println("学校："+this.school);
    }
}
