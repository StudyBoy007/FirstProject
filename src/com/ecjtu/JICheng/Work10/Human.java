package com.ecjtu.JICheng.Work10;

/**
 * Create by czq
 * time on 2019/6/3  16:11
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Human(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void play(){
        System.out.println("人类都有自己喜欢做的事情!!!");
    }
}
