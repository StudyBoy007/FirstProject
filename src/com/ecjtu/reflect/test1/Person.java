package com.ecjtu.reflect.test1;

/**
 * Create by czq
 * time on 2019/5/31  12:42
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println(this.name+"的年龄为："+this.age);
    }

    public static void main(String[] args) {
        Person person = new Person("蔡泽球", 22);
        person.display();
    }
}
