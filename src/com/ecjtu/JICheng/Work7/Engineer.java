package com.ecjtu.JICheng.Work7;

/**
 * Create by czq
 * time on 2019/6/3  19:10
 */
public class Engineer extends Employee {
    private String department;
    private String specialty;

    public Engineer() {
        this.department="皮皮欢乐小学";
        this.specialty="领导化管理";
    }

    public Engineer(String name, int age, String nation, String department, String specialty) {
        super(name, age, nation);
        this.department = department;
        this.specialty = specialty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public String show(){
        String newStr=getName()+",年龄"+getAge()+"岁,"+getNation()+"人,在"+this.department+"做着"+this.specialty+"的工作";
        return newStr;
    }
}
