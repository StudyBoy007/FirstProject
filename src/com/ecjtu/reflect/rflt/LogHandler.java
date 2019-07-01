package com.ecjtu.reflect.rflt;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Create by czq
 * time on 2019/6/27  22:28
 */
public class LogHandler implements InvocationHandler {

    private Object obj;

    public LogHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("do before");
        Object invoke = method.invoke(obj, args);
        System.out.println("do after");
        return invoke;
    }
}
