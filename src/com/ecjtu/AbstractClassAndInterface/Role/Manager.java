package com.ecjtu.AbstractClassAndInterface.Role;

/**
 * Create by czq
 * time on 2019/6/4  15:18
 */
public class Manager extends Employee {
    private final String Vehice="法拉利";
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    public Manager(String name, int age, String sex, double salary) {
        super(name, age, sex, salary);
    }

    @Override
    public void play() {
        System.out.println(getName()+":打打高尔夫，陶冶情操");
    }

    public String getVehice() {
        return Vehice;
    }


}
