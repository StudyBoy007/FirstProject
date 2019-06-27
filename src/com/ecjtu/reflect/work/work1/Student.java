package com.ecjtu.reflect.work.work1;

/**
 * Create by czq
 * time on 2019/6/27  10:31
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {

    }

    public Student(String name) {
        this.name = name;
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


    public void show() {
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}');
    }
}
