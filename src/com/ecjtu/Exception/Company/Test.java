package com.ecjtu.Exception.Company;

/**
 * Create by czq
 * time on 2019/6/5  17:29
 */
public class Test {
    public static void main(String[] args) {
        try {
            Staff.getTotalSalary();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        try {
            Staff.getStaffNumber();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("----------------------------");

        Staff staff1 = ClassFactory(1);
        staff1.getTotalSalary();
        staff1.getStaffNumber();
        System.out.println("----------------------------");
        Staff staff2 = ClassFactory(2);
        staff2.getTotalSalary();
        staff2.getStaffNumber();
        System.out.println("----------------------------");
        Staff staff3 = ClassFactory(3);
        staff3.getTotalSalary();
        staff3.getStaffNumber();
        System.out.println("----------------------------");
        Staff staff4 = ClassFactory(4);
        staff4.getTotalSalary();
        staff4.getStaffNumber();
        try {
            staff4.addSalary(1000);
            staff4.getTotalSalary();
            staff4.addSalary(19001);
        } catch (SalaryUpperException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("----------------------------");
        System.out.println(staff4.getName() + "我现在工资为：" + staff4.getSalary());
        try {
            staff4.minusSalary(4000);
            staff4.getTotalSalary();
            staff4.minusSalary(4001);
        } catch (SalaryLowException e) {
            System.out.println(e.getMessage());
        }


    }

    public static Staff ClassFactory(int number) {
        Staff s = null;
        try {
            switch (number) {
                case 1:
                    s = new Staff("蔡泽球", 20, 10000, "36232619980114001");
                case 2:
                    s = new Staff("李飞", 17, 5000, "362326199801140019");
                case 3:
                    s = new Staff("", 25, 4000, "362326199801140011");
                case 4:
                    s = new Staff("刘梦昊", 25, 8000, "362326199801140012");
            }
        } catch (AgeLowException e) {
            System.out.println(e.getMessage());
            return s;
        } catch (AgeUpperException e) {
            System.out.println(e.getMessage());
            return s;
        } catch (IdentityCardException e) {
            System.out.println(e.getMessage());
            return s;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return s;
        }
        return s;
    }
}
