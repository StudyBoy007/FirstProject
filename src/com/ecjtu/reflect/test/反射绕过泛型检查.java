package com.ecjtu.reflect.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by czq
 * time on 2019/6/27  19:20
 */
public class 反射绕过泛型检查 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Class aClass = list.getClass();
        Method method = aClass.getMethod("add", Object.class);
        method.invoke(list, "helloworld");
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
