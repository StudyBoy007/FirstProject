package com.ecjtu.reflect.work.work1.factory;

import com.ecjtu.reflect.work.work1.ConstructImp;
import com.ecjtu.reflect.work.work1.Student;

/**
 * Create by czq
 * time on 2019/6/27  10:56
 */
public class StudentCone implements ConstructImp {
    @Override
    public Student getStudent() {
        return new Student();
    }
}
