package com.ecjtu.reflect.test;

import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

/**
 * Create by czq
 * time on 2019/6/27  20:26
 */
public class Test3 {
    public void test() {
    }

    public static void test2() {
    }

    public void test(int a) {
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<Test3> test3Class = Test3.class;
        Method[] declaredMethods = test3Class.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }
        System.out.println("-----------------------");
        Method test = test3Class.getDeclaredMethod("test", int.class);
        System.out.println(test.getName());
    }
}
