package com.ecjtu.reflect.test;

import sun.java2d.pipe.SpanIterator;

/**
 * Create by czq
 * time on 2019/6/27  9:03
 */
public class ClassLoad {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        ClassLoader parent = systemClassLoader.getParent().getParent();
        System.out.println(systemClassLoader);
        System.out.println(parent);
        try {
            Object aClass = Class.forName("java.lang.Object").newInstance();
            System.out.println(aClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
