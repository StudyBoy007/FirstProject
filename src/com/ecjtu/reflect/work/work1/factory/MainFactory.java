package com.ecjtu.reflect.work.work1.factory;

import com.ecjtu.reflect.work.work1.Student;

/**
 * Create by czq
 * time on 2019/6/27  10:58
 */
public class MainFactory {
    public static void main(String[] args) {
        StudentCone studentCone = new StudentCone();
        Student student = studentCone.getStudent();
        System.out.println(student);

        StudentCTwo studentCtwo = new StudentCTwo();
        Student studenttwo = studentCtwo.getStudent();
        System.out.println(studenttwo);

        StudentCThree studentCthree = new StudentCThree();
        Student studentthree = studentCthree.getStudent();
        System.out.println(studentthree);

    }
}
