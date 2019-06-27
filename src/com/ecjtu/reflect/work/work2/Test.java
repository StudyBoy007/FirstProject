package com.ecjtu.reflect.work.work2;

import java.lang.reflect.Proxy;

/**
 * Create by czq
 * time on 2019/6/27  16:41
 */
public class Test {
    public static void main(String[] args) {
        Userimp userimp = new Userimp();
        UserHandler handler = new UserHandler(userimp);
        User userHandler = (User) Proxy.newProxyInstance(userimp.getClass().getClassLoader(), userimp.getClass().getInterfaces(), handler);
        System.out.println("加入的元素在该对象集合中的索引为："+userHandler.add(userimp));

    }
}
