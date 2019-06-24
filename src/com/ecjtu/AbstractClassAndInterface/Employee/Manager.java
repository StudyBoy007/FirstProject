package com.ecjtu.AbstractClassAndInterface.Employee;

/**
 * Create by czq
 * time on 2019/6/4  10:48
 */
public class Manager extends Employee {
    private int bonus;

    public Manager(int id, String name, double salary, int bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public double work() {
        return getSalary()+bonus;
    }
}
