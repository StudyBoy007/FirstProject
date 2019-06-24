package com.ecjtu.AbstractClassAndInterface.Employee;

/**
 * Create by czq
 * time on 2019/6/4  10:56
 */
public class Test {
    public static void main(String[] args) {
        CommonEmployee employee1 = new CommonEmployee(1, "飞总", 1000);
        getSalary(employee1);
        Manager manager = new Manager(2, "昊哥", 1500, 500);
        getSalary(manager);
    }

    public static void getSalary(Employee employee) {
        System.out.println(employee.getName()+"的工资为："+employee.work());
    }

}
