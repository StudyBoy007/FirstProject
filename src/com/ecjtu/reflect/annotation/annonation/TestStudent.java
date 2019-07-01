package com.ecjtu.reflect.annotation.annonation;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestStudent {


    @Test
    public void getFieldAnnonation(){
        Class cls=Student.class;
        try {
            Student stu=(Student)cls.newInstance();
            Field name=cls.getDeclaredField("name");
            name.setAccessible(true);
            if(name.isAnnotationPresent(Param.class)){
                Param param =name.getAnnotation(Param.class);
                System.out.println(param.name()+","
                        +param.age()+","+param.address()[0]+","+param.sex()+","+param.hobby());
            }


        } catch (InstantiationException | NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void getConstructorAnnonation(){
        Class cls=Student.class;
        try {
            Constructor con=cls.getConstructor(new Class[]{String.class,int.class,String.class,String.class});
            if(con.isAnnotationPresent(Param.class)){
                Param param=(Param)con.getAnnotation(Param.class);
                System.out.println(param.name()+","
                        +param.age()+","+param.address()[0]+","+param.sex());

            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void getMethodAnnonation(){
        Class cls=Student.class;
        try {
            Method method=cls.getMethod("getAge",new Class[]{});
            if(method.isAnnotationPresent(Param.class)){
                Param param=(Param)method.getAnnotation(Param.class);
                System.out.println(param.name()+","
                        +param.age()+","+param.address()[0]+","+param.sex());

            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
