package com.ecjtu.Collection.map.work15;

/**
 * Create by czq
 * time on 2019/6/24  19:42
 */
public class Student {
    private String name;
    private int age;
    private double score;
    private String className;

    public Student(String name, int age, double score, String className) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.className = className;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
