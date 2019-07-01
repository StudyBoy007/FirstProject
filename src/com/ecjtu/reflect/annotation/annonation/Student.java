package com.ecjtu.reflect.annotation.annonation;

public class Student {
    @Param(name = "李丽")
    private String name;
    @Param(age = 23)
    private int age;
    @Param(sex = "女")
    private String sex;

    private String address;

    public Student() {

    }

    @Param(name = "李四", age = 24, address = {"华东交通大学北区"})
    public Student(String name, int age, String sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Param(age = 34)
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
