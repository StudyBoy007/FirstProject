package com.ecjtu.reflect.work.work1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Create by czq
 * time on 2019/6/27  10:32
 */
public class ConstucttStudent {
    public static void main(String[] args) {

        Class<Student> studentClass = Student.class;
        try {
            Class[] classes = {String.class, int.class};
            Student student = studentClass.getConstructor(classes).newInstance("阿飞", 12);
            Student student1 = studentClass.getDeclaredConstructor(String.class).newInstance("阿飞");
            Student student2 = studentClass.newInstance();
            System.out.println(student.getName() + ":" + student.getAge());
            System.out.println(student1.getName());
            student2.show();

            Field age = studentClass.getDeclaredField("age");
            age.setAccessible(true);
            age.set(student2, 22);
            student2.show();

            Method declaredMethods = studentClass.getDeclaredMethod("show", null);
            declaredMethods.invoke(student2);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
