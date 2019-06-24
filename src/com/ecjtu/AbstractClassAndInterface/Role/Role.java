package com.ecjtu.AbstractClassAndInterface.Role;

/**
 * Create by czq
 * time on 2019/6/4  14:35
 */
public abstract class Role {
    private String name;
    private int age;
    private String sex;

    public Role() {
    }

    public Role(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Role(String name, int age, String sex) {
        this(name,age);
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public abstract void play();
}
