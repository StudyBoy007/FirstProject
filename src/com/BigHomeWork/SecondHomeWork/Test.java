package com.BigHomeWork.SecondHomeWork;

/**
 * Create by czq
 * time on 2019/6/9  21:53
 */

import java.util.Scanner;

public class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        StudentAdmin admin = new StudentAdmin();
        System.out.println(" 请输入学生的人数： ");
        int studentNumber = input.nextInt();
        Student[] students = new Student[studentNumber];
        while (true) {
            System.out.println(" 请选择要执行的功能（输入编号） ：");
            System.out.println("10 ：添加一个学生 ");
            System.out.println("11: 查找一个学生 ");
            System.out.println("12 ：根据学生编号更新学生基本信息 ");
            System.out.println("13: 根据学生编号删除学生 ");
            System.out.println("14 ：根据编号输入学生各门科的成绩 ");
            System.out.println("15: 根据某门成绩进行排序 ");
            System.out.println("16 ：根据总分进行排序 ");
            System.out.println("99 ：退出系统 ");
            int number = input.nextInt();
            if (number == 10) {
                System.out.println("-- 执行添加学生操作 --");
                System.out.println(" 请输入要添加学生的姓名： ");
                String name = input.next();
                System.out.println(" 请输入要添加学生的年龄： ");
                int age = input.nextInt();
                admin.addStudent(name, age, students);
                admin.print(students);
            } else if (number == 11) {
                System.out.println("-- 执行查找学生操作 --");
                System.out.println(" 请输入要查找学生的编号 :");
                admin.selectStudent(input.nextInt(), students);
            } else if (number == 12) {
                System.out.println(" 执行更新学生信息操作 ");
                System.out.println(" 请输入要修改信息学生的编号 ");
                int id = input.nextInt();
                System.out.println(" 请输入修改后学生的姓名： ");
                String name = input.next();
                System.out.println(" 请输入修改后学生的年龄： ");
                int age = input.nextInt();
                admin.updateStudent(id, name, age, students);
                admin.print(students);
            } else if (number == 13) {
                System.out.println("-- 执行删除操作 --");
                System.out.println(" 请输入要删除学生的编号： ");
                int id = input.nextInt();
                admin.deleteStudent(id, students);
            } else if (number == 14) {
                System.out.println("-- 执行输入学生成绩操作 --");
                System.out.println(" 请输入要输入成绩学生的编号 :");
                int id = input.nextInt();
                admin.inputScore(id, students, input);
            } else if (number == 15) {
                System.out.println(" 执行成绩排序操作 ");
                System.out.println(" 请选择用什么成绩排序： （ 1:java 2:charp 3:html 4:sql ）");
                int score = input.nextInt();
                admin.scoreSort(score, students);
            } else if (number == 16) {
                System.out.println(" 执行总分排序操作 ");
                admin.sumSort(students);
            } else if (number == 99) {
                System.out.println(" 退出系统成功！ ！！");
                break; //System.exit(0);
            } else {
                System.out.println(" 输入有误，请重新输入 ");
            }
        }
    }
}
