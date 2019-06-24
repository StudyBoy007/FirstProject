package com.ecjtu.AbstractClassAndInterface.Role;

/**
 * Create by czq
 * time on 2019/6/4  14:38
 */
public class Employee extends Role {
    private double salary;
    private int id;
    private static int total;
    static {
        total=1000;
    }

    public Employee(String name, int age, double salary) {
        super(name, age);
        id=total++;
        this.salary = salary;
    }

    public Employee(String name, int age, String sex, double salary) {
        id=total++;
        super.setName(name);
        super.setAge(age);
        super.setSex(sex);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void play() {
        System.out.println(getName()+":下班了，和小伙伴唠唠嗑");
    }
    public final void sing(){
        System.out.println(getName()+":唱歌是我一生都不变的信仰");
    }
}
