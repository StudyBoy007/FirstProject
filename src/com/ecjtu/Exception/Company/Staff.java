package com.ecjtu.Exception.Company;

import com.sun.xml.internal.org.jvnet.fastinfoset.stax.LowLevelFastInfosetStreamWriter;

/**
 * Create by czq
 * time on 2019/6/5  16:21
 */
public class Staff {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String idCard;
    private static int StaffNumber;
    private static double totalSalary;
    private static double lowestSalary;

    static {
         lowestSalary=1000;
    }
    public Staff(String name, int age, double salary, String idCard) throws AgeLowException, AgeUpperException,IdentityCardException {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.idCard = idCard;
        this.id = StaffNumber++;
        totalSalary += this.salary;
        if (this.age < 18) {
            throw new AgeLowException("异常！！"+getName()+","+this.age + "岁,年龄太小啦！！");
        } else if (this.age > 60) {
            throw new AgeUpperException("异常！！"+getName()+","+this.age + "岁,年龄太大啦！！");
        }

        if (this.name == null || "".equals(this.name)) {
            throw new NullPointerException("异常！！空指针异常咯！！");
        }
        if (this.idCard.length() != 18) {
            throw new IdentityCardException("异常！！"+getName()+"：您的身份证非法异常！");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getId() {
        return id;
    }

    public static void getStaffNumber() {
        if(StaffNumber==0){
            throw new NullPointerException("异常！!员工总人数为0，出现异常啦！");
        }
        System.out.println("员工总人数为："+StaffNumber);
    }

    public static void getTotalSalary() {
        if(totalSalary==0){
            throw new NullPointerException("异常！!员工总工资为0，老板跑路啦！");
        }
        System.out.println("员工总工资为："+totalSalary);
    }

    public void addSalary(double salary) throws SalaryUpperException {
        if(this.salary+salary>totalSalary){
            throw new SalaryUpperException("异常！！"+getName()+"：加完工资后，你的工资："+(this.salary+salary)+"元,大于目前所有员工工资:"+totalSalary+"元的总和了!");
        }
        this.salary=this.salary+salary;
        totalSalary+=salary;
        System.out.println(getName()+"：好开心，终于加了"+salary+"元工资啦！我的工资现在有："+this.salary+"元");
    }

    public void minusSalary(double salary) throws SalaryLowException {
        if(this.salary-salary<lowestSalary){
            throw new SalaryLowException("异常！！"+getName()+"：扣完工资后，你的工资:"+(this.salary-salary)+"元,小于政府规定的最低工资:"+lowestSalary+"元!");
        }
        this.salary=this.salary-salary;
        System.out.println(getName()+"：好伤心，被扣了"+salary+"元工资啦！我的工资现在有："+this.salary+"元");
        totalSalary-=salary;
    }

}
