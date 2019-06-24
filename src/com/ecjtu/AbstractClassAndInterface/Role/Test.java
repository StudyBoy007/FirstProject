package com.ecjtu.AbstractClassAndInterface.Role;

/**
 * Create by czq
 * time on 2019/6/4  15:20
 */
public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("飞总", 20, "男", 2000);
        System.out.println(employee.getName()+"的员工编号为："+employee.getId());
        employee.play();
        employee.sing();
        System.out.println("---------------------------------------------------");
        Manager manager = new Manager("球哥", 21, "男", 3000);
        System.out.println(manager.getName()+"的员工编号为："+manager.getId());
        manager.play();
        System.out.println("领导的标配："+manager.getVehice());
    }
}
