package com.ecjtu.AbstractClassAndInterface.Employee;

/**
 * Create by czq
 * time on 2019/6/4  10:47
 */
public abstract class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(){

    }
    //抽象类需要构造函数是因为子类创建对象时候构造函数内会调用父类的构造函数，给属性赋值
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //抽象方法没有返回体
    public abstract double work();
}
