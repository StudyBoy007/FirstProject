package com.ecjtu.JICheng.Work12;

/**
 * Create by czq
 * time on 2019/6/3  11:22
 */
public class Graduate extends Student {
    private String studydirection;

    public Graduate(String name, int age, String studydirection) {
        super(name, age);
        this.studydirection = studydirection;
    }
    public void display(){
        System.out.println("姓名："+super.getName());
        System.out.println("年龄："+super.getAge());
        System.out.println("研究方向："+this.studydirection);
    }
}
