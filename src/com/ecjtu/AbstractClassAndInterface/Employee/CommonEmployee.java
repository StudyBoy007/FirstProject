package com.ecjtu.AbstractClassAndInterface.Employee;

/**
 * Create by czq
 * time on 2019/6/4  10:53
 */
public class CommonEmployee extends Employee {
    public CommonEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double work() {
        return getSalary();
    }

}
